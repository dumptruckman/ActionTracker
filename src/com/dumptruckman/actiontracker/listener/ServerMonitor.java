package com.dumptruckman.actiontracker.listener;

import org.bukkit.event.server.PluginDisableEvent;
import org.bukkit.event.server.ServerListener;
import com.dumptruckman.actiontracker.task.ActionTracker;

/**
 * @author dumptruckman
 */
public class ServerMonitor extends ServerListener {

    public void onPluginDisable(PluginDisableEvent event) {
        if (event.getPlugin().equals(ActionTracker.getPlugin())) {
            ActionTracker.shutdown();
        }
    }
}
