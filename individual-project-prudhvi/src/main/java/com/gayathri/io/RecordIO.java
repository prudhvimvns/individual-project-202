package com.prudhvi.io;

import com.prudhvi.cc.CreditCard;

import java.util.List;

public interface RecordIO {
    List<CreditCard> read(String filename);

    boolean write(String filename, List<CreditCard> records);
}