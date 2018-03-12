package org.labb17.svartablixten;

import java.util.ArrayList;

/**
 * Created by joakimlilja on 2018-03-10.
 */

public enum INSTRUCTIONS {
    FORWARD, ROTATE_LEFT, ROTATE_RIGHT, REVERSE;
    public static int COUNT = INSTRUCTIONS.values().length;
    public static String[] TEXT_SV = {"FRAMÅT", "BAKÅT", "ROTERA HÖGER", "ROTERA VÄNSTER"};
}
