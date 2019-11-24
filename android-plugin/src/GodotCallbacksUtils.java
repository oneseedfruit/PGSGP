package org.godotengine.godot;

public class GodotCallbacksUtils {

    /**
     * Sign in callbacks
     */
    public static final String SIGNIN_SUCCESSFUL = "_on_sign_in_success";
    public static final String SIGNIN_FAILED = "_on_sign_in_failed";
    public static final String SIGN_OUT_SUCCESS = "_on_sign_out_success";
    public static final String SIGN_OUT_FAILED = "_on_sign_out_failed";
    /**
     * Connection callbacks
     */
    public static final String PLAYER_CONNECTED = "_on_player_is_already_connected";
    /**
     * Achievements callbacks
     */
    public static final String ACHIEVEMENT_UNLOCKED = "_on_achievement_unlocked";
    public static final String ACHIEVEMENT_UNLOCKED_FAILED = "_on_achievement_unlocking_failed";
    public static final String ACHIEVEMENT_REVEALED = "_on_achievement_revealed";
    public static final String ACHIEVEMENT_REVEALED_FAILED = "_on_achievement_revealing_failed";
    public static final String ACHIEVEMENT_INCREMENTED = "_on_achievement_incremented";
    public static final String ACHIEVEMENT_INCREMENTED_FAILED = "_on_achievement_incrementing_failed";
    /**
     * Leaderboards callbacks
     */
    public static final String LEADERBOARD_SCORE_SUBMITTED = "_on_leaderboard_score_submitted";
    public static final String LEADERBOARD_SCORE_SUBMITTED_FAILED = "_on_leaderboard_score_submitting_failed";

    private int godotInstanceId;

    public void setGodotInstanceId(int godotInstanceId) {
        this.godotInstanceId = godotInstanceId;
    }

    public void invokeGodotCallback(String callbackName, Object[] args) {
        GodotLib.calldeferred(godotInstanceId, callbackName, args);
    }
}
