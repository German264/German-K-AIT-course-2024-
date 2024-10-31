package album.dao;

import album.model.Photo;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Predicate;

public class AlbumImpl implements Album{

    private Photo[] photos;
    private int size;

    public AlbumImpl(int capacity) {
        this.photos = new Photo[capacity];
        // this.size = 0;
    }

    // Comparator sort by albumId then by photoId
    Comparator<Photo> comparator = (p1, p2) -> {
        int res = Integer.compare(p1.getAlbumId(), p2.getAlbumId());
        return res !=0 ? res : Integer.compare(p1.getPhotoId(), p2.getPhotoId());
    };


    @Override
    public boolean addPhoto(Photo photo) {
        if(photo == null || size == photos.length){
            return false;
        }
        if(getPhotoFromAlbum(photo.getAlbumId(), photo.getPhotoId()) != null){
            return false;
        }

        // Arrays.sort(photos, comparator);
        // find index where insert photo
        int index = Arrays.binarySearch(photos, 0, size, photo, comparator);
        index = index >=0 ? index : - index - 1;
        // эту строчку надо добавить, мы в ней раздвигаем массив для вставки элемента
        System.arraycopy(photos, index, photos, index + 1, size - index);
        photos[index] = photo;
        size++;
        return true;
    }

    @Override
    public boolean removePhoto(int albumId, int photoId)  {
        for (int i = 0; i < size; i++) {
            if(photos[i].getAlbumId() == albumId && photos[i].getPhotoId() == photoId){
                System.arraycopy(photos, i + 1, photos, i, size - i -1);
                photos[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updatePhoto(int albumId, int photoId, String url)  {
        Photo photo = getPhotoFromAlbum(albumId, photoId);
        if(photo == null){
            return false;
        }
        photo.setUrl(url);
        return true;
    }


    @Override
    public Photo getPhotoFromAlbum(int albumId, int photoId)  {
        for (int i = 0; i < size; i++) {
            if(photos[i].getAlbumId() == albumId && photos[i].getPhotoId() == photoId){
                return photos[i];
            }
        }
        return null;
    }


    @Override
    public Photo[] getAllPhotoFromAlbum(int albumId)  {
        return findPhotoByPredicate(p -> p.getAlbumId() == albumId);
    }

    @Override
    public Photo[] getPhotoBetweenDate(LocalDate dateFrom, LocalDate dateTo) {
        // этот метод мы еще не реализовали
        return findPhotoByPredicate(p -> p.getDate().toLocalDate().isAfter(dateFrom.minusDays(1)) && p.getDate().toLocalDate().isBefore(dateTo.plusDays(1)));

        //(events[i].getData().isEqual(dateFrom) || events[i].getData().isAfter(dateFrom)) &&
        //(events[i].getData().isEqual(dateTo) || events[i].getData().isBefore(dateTo)))
    }

    @Override
    public int size() {
        return size;
    }

    // служебный метод для отбора объектов из массива по критерию

    private Photo[] findPhotoByPredicate(Predicate<Photo> predicate) {
        Photo[] res = new Photo[size];
        int j = 0; // это индексы массива результатов
        for (int i = 0; i < size; i++) {
            if(predicate.test(photos[i])){
                res[j++] = photos[i];
            }
        }
        return Arrays.copyOf(res, j); // обрезаем хвост из null
    }
}