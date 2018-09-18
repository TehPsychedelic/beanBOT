package com.mazawrath.beanbot.commands.beancoin;

import com.mazawrath.beanbot.utilities.Points;
import de.btobastian.sdcf4j.Command;
import de.btobastian.sdcf4j.CommandExecutor;
import org.javacord.api.entity.channel.ServerTextChannel;
import org.javacord.api.entity.server.Server;
import org.javacord.api.entity.user.User;

public class BeanbalanaceCommand implements CommandExecutor{
    private Points points;

    public BeanbalanaceCommand(Points points) {
        this.points = points;
    }

    @Command(
            aliases = {"beanbalance"},
            description = "Check how many beanCoin you have.",
            privateMessages = false
    )

    public void onCommand(ServerTextChannel serverTextChannel, User author, Server server) {
            System.out.println(server.getIdAsString());
            serverTextChannel.sendMessage("You have " + points.getBalance(author.getIdAsString(), server.getIdAsString()) + " beanCoin.");
    }
}