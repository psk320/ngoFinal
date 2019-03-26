package com.cts.ngo.dao;
import java.util.*;

import com.cts.ngo.bean.Ngo;

public interface NgoDAO {
public List<Ngo> getNgos();
public void saveNgo(Ngo theNgo);
}