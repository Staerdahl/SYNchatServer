package Business;

import Acquaintance.IFriends;
import Acquaintance.IProfile;
import Acquaintance.IUser;
import Acquaintance.Nationality;
import java.util.List;

public class User implements IUser {

    private int userID;
    private boolean banned; // a flag for if the user is banned
    private int reports;    // the amount of reprts a user have recived
    private List<Integer> chats;
    private IProfile profile;
    private Friends friends;

    public User(String firstName, String lastName, Nationality nationality, String profileText) {
        profile = new Profile(firstName, lastName, nationality, profileText);
    }


    public User(int userID, String tmpName, boolean banned, int reports, List<Integer> chats, Friends newFriends) {
        this.userID = userID;
        this.banned = banned;
        this.reports = reports;
        this.chats = chats;
        this.friends = newFriends;
    }

    @Override
    public int getUserID() {
        return userID;
    }

    @Override
    public boolean isBanned() {
        return banned;
    }

    @Override
    public int getReports() {
        return reports;
    }

    @Override
    public List<Integer> getChats() {
        return chats;
    }

    @Override
    public IProfile getProfile() {
        return profile;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setBanned(boolean banned) {
        this.banned = banned;
    }

    public void setReports(int reports) {
        this.reports = reports;
    }

    public void setChats(List<Integer> chats) {
        this.chats = chats;
    }

    public void setProfile(IProfile profile) {
        this.profile = profile;
    }

    @Override
    public IFriends getFriends() {
        return friends;
    }
    
     public void setFriends(IFriends friends){
        this.friends = (Friends) friends;
     }

    Boolean updateFriends(IFriends newFriends, int userID) {
        return friends.updateFriends(newFriends, userID);
    }

}
