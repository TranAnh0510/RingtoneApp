package trim;

/**
 * Interface definition for a callback to be invoked when trimming a video.
 * @author AnhTTH
 */
public interface OnTrimVideoListener {
    /**
     * Called when the video is ready for trimming.
     * @author AnhTTH
     */
    void onReady();

    /**
     * Called when the start time of the trimmed portion of the video changes.
     * @param timeStart The new start time in milliseconds.
     * @author AnhTTH
     */
    void onTimeStartChanged(int timeStart);

    /**
     * Called when the end time of the trimmed portion of the video changes.
     * @param timeEnd The new end time in milliseconds.
     * @author AnhTTH
     */
    void onTimeEndChanged(int timeEnd);

    /**
     * Called when the user selects a specific portion of the video to be trimmed.
     * @param timeStart The start time of the selected portion in milliseconds.
     * @param timeEnd   The end time of the selected portion in milliseconds.
     * @author AnhTTH
     */
    void onTimeSelected(int timeStart, int timeEnd);

    /**
     * Called periodically during the trimming process to provide the current time.
     * @param time The current time in milliseconds.
     * @author AnhTTH
     */
    void onTimeRun(int time);

    /**
     * Called when the user moves the trimming marker to a different position.
     * @param time The time to which the marker has been moved in milliseconds.
     * @author AnhTTH
     */
    void onMoveTime(int time);
}