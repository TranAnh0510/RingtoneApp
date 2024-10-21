package com.example.appa.data.repository.recent;

/**
 * Repository interface for managing recent items in the application.
 * @author AnhTTH
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004H&J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\fH&\u00a8\u0006\r"}, d2 = {"Lcom/example/appa/data/repository/recent/RecentRepo;", "", "getALlRecent", "", "Lcom/example/appa/data/model/ItemRecent;", "insertRecent", "", "item", "updateTimeRecent", "", "time", "path", "", "app_debug"})
public abstract interface RecentRepo {
    
    /**
     * Inserts a recent item into room database.
     * @param item the recent item to be inserted.
     * @return the row ID of the newly inserted recent item.
     * @author AnhTTH
     */
    public abstract long insertRecent(@org.jetbrains.annotations.NotNull()
    com.example.appa.data.model.ItemRecent item);
    
    /**
     * Updates the time added of a recent item from room database.
     * @param time the new time to be set.
     * @param path the path of the recent item to be updated.
     * @return true if the update was successful, false otherwise.
     * @author AnhTTH
     */
    public abstract boolean updateTimeRecent(long time, @org.jetbrains.annotations.NotNull()
    java.lang.String path);
    
    /**
     * Retrieves all recent items from room database.
     * @return a list of all recent items.
     * @author AnhTTH
     */
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<com.example.appa.data.model.ItemRecent> getALlRecent();
}