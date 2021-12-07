package com.example.hideandshow;

public class
{ActivityManager am = (ActivityManager)getSystemService(Context.ACTIVITY_SERVICE);
        if(am != null) {
        List<ActivityManager.AppTask> tasks = am.getAppTasks();
        if (tasks != null && tasks.size() > 0) {
        tasks.get(0).setExcludeFromRecents(true);
        }
        }
}
        }