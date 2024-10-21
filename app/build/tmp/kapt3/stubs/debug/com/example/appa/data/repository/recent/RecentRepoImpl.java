package com.example.appa.data.repository.recent;

/**
 * Implementation of the RecentRepo interface for managing recent items using a DAO.
 * @property recentDao the DAO for accessing recent items data.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/appa/data/repository/recent/RecentRepoImpl;", "Lcom/example/appa/data/repository/recent/RecentRepo;", "recentDao", "Lcom/example/appa/data/local/room/RecentDao;", "(Lcom/example/appa/data/local/room/RecentDao;)V", "getALlRecent", "", "Lcom/example/appa/data/model/ItemRecent;", "insertRecent", "", "item", "updateTimeRecent", "", "time", "path", "", "app_debug"})
public final class RecentRepoImpl implements com.example.appa.data.repository.recent.RecentRepo {
    @org.jetbrains.annotations.NotNull()
    private final com.example.appa.data.local.room.RecentDao recentDao = null;
    
    @javax.inject.Inject()
    public RecentRepoImpl(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.local.room.RecentDao recentDao) {
        super();
    }
    
    /**
     * Inserts a recent item into room database.
     * @param item the recent item to be inserted.
     * @return the row ID of the newly inserted recent item.
     * @author AnhTTH
     */
    @java.lang.Override()
    public long insertRecent(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.ItemRecent item) {
        return 0L;
    }
    
    /**
     * Retrieves all recent items from room database, ensuring uniqueness by nameSound.
     * @return a list of all recent items, with each nameSound appearing only once.
     * @author AnhTTH
     */
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<com.example.appa.data.model.ItemRecent> getALlRecent() {
        return null;
    }
    
    /**
     * Updates the time added of a recent item in room database.
     * @param time the new time to be set.
     * @param path the path of the recent item to be updated.
     * @return true if the update was successful, false otherwise.
     * @author AnhTTH
     */
    @java.lang.Override()
    public boolean updateTimeRecent(long time, @org.jetbrains.annotations.NotNull()
    java.lang.String path) {
        return false;
    }
}