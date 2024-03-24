package homework.impl;

import java.util.HashMap;

public interface Persister{
    public void save();
    public HashMap<Integer, String> getUsers();
}
