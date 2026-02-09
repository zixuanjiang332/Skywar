package jdd.skyWar.playerEvent;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.messaging.Messenger;

public class MyfirstListener implements Listener {
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();

        // 发送带颜色的标题
        player.sendTitle(
                ChatColor.GOLD + "欢迎来到服务器！", // 主标题（金色）
                ChatColor.AQUA + "祝你游戏愉快~",   // 副标题（水蓝色）
                10,  // 渐入时间（ticks）
                70,  // 显示时间（ticks）
                20   // 渐出时间（ticks）
        );
    }
}
