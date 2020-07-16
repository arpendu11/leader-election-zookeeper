package com.microfocus.leader_election;

import java.io.IOException;

import org.apache.zookeeper.KeeperException;

public class App {
	public static void main( String[] args ) throws IOException, InterruptedException, KeeperException
    {
        LeaderElection leaderElection  = new LeaderElection();
        leaderElection.connectToZookeper();
        leaderElection.volunteerForLeadership();
        leaderElection.reelectLeader();
        leaderElection.run();
        leaderElection.close();
        System.out.println("Disconnected from zooKeeper, exiting application!!");
    }
}
