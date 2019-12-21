package com.mayank.rucky;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.HashMap;

import static java.lang.Integer.parseInt;

class hid {

    private static final int us = 0;
    private static final int tr = 1;
    private static final int sv = 2;
    private static final int si = 3;
    private static final int ru = 4;
    private static final int pt = 5;
    private static final int no = 6;
    private static final int it = 7;
    private static final int hr = 8;
    private static final int gb = 9;
    private static final int fr = 10;
    private static final int fi = 11;
    private static final int es = 12;
    private static final int dk = 13;
    private static final int de = 14;
    private static final int ca = 15;
    private static final int br = 16;
    private static final int be = 17;
    private static final int hu = 18;

    private float defdelay = 0;
    private ArrayList<String> shell = new ArrayList<>();
    private HashMap<String, String> keys = new HashMap<>();
    private HashMap<String, String> keycodes = new HashMap<>();

    hid(int x) {
        initKey();
        initLangMap(x);
    }

    private void initKey() {
        keys.put("MODIFIERKEY_CTRL","01");
        keys.put("MODIFIERKEY_SHIFT","02");
        keys.put("MODIFIERKEY_CTRL_SHIFT","03");
        keys.put("MODIFIERKEY_ALT","04");
        keys.put("MODIFIERKEY_CTRL_ALT","05");
        keys.put("MODIFIERKEY_ALT_SHIFT","06");
        keys.put("MODIFIERKEY_CTRL_SHIFT_ALT","07");
        keys.put("MODIFIERKEY_GUI","08");
        keys.put("MODIFIERKEY_CTRL_GUI","09");
        keys.put("MODIFIERKEY_SHIFT_GUI","0A");
        keys.put("MODIFIERKEY_CTRL_SHIFT_GUI","0B");
        keys.put("MODIFIERKEY_ALT_GUI","0C");
        keys.put("MODIFIERKEY_CTRL_ALT_GUI","0D");
        keys.put("MODIFIERKEY_ALT_SHIFT_GUI","0E");
        keys.put("MODIFIERKEY_CTRL_SHIFT_ALT_GUI","0F");
        keys.put("MODIFIERKEY_LEFT_CTRL","01");
        keys.put("MODIFIERKEY_LEFT_SHIFT","02");
        keys.put("MODIFIERKEY_LEFT_CTRL_SHIFT","03");
        keys.put("MODIFIERKEY_LEFT_ALT","04");
        keys.put("MODIFIERKEY_LEFT_CTRL_ALT","05");
        keys.put("MODIFIERKEY_LEFT_ALT_SHIFT","06");
        keys.put("MODIFIERKEY_LEFT_CTRL_SHIFT_ALT","07");
        keys.put("MODIFIERKEY_LEFT_GUI","08");
        keys.put("MODIFIERKEY_LEFT_CTRL_GUI","09");
        keys.put("MODIFIERKEY_LEFT_SHIFT_GUI","0A");
        keys.put("MODIFIERKEY_LEFT_CTRL_SHIFT_GUI","0B");
        keys.put("MODIFIERKEY_LEFT_ALT_GUI","0C");
        keys.put("MODIFIERKEY_LEFT_CTRL_ALT_GUI","0D");
        keys.put("MODIFIERKEY_LEFT_ALT_SHIFT_GUI","0E");
        keys.put("MODIFIERKEY_LEFT_CTRL_SHIFT_ALT_GUI","0F");
        keys.put("MODIFIERKEY_RIGHT_CTRL","10");
        keys.put("MODIFIERKEY_RIGHT_SHIFT","20");
        keys.put("MODIFIERKEY_RIGHT_CTRL_SHIFT","30");
        keys.put("MODIFIERKEY_RIGHT_ALT","40");
        keys.put("MODIFIERKEY_RIGHT_CTRL_ALT","50");
        keys.put("MODIFIERKEY_RIGHT_ALT_SHIFT","60");
        keys.put("MODIFIERKEY_RIGHT_CTRL_SHIFT_ALT","70");
        keys.put("MODIFIERKEY_RIGHT_GUI","80");
        keys.put("MODIFIERKEY_RIGHT_CTRL_GUI","90");
        keys.put("MODIFIERKEY_RIGHT_SHIFT_GUI","A0");
        keys.put("MODIFIERKEY_RIGHT_CTRL_SHIFT_GUI","B0");
        keys.put("MODIFIERKEY_RIGHT_ALT_GUI","C0");
        keys.put("MODIFIERKEY_RIGHT_CTRL_ALT_GUI","D0");
        keys.put("MODIFIERKEY_RIGHT_ALT_SHIFT_GUI","E0");
        keys.put("MODIFIERKEY_RIGHT_CTRL_SHIFT_ALT_GUI","F0");
        keys.put("KEY_A","04");
        keys.put("KEY_B","05");
        keys.put("KEY_C","06");
        keys.put("KEY_D","07");
        keys.put("KEY_E","08");
        keys.put("KEY_F","09");
        keys.put("KEY_G","0A");
        keys.put("KEY_H","0B");
        keys.put("KEY_I","0C");
        keys.put("KEY_J","0D");
        keys.put("KEY_K","0E");
        keys.put("KEY_L","0F");
        keys.put("KEY_M","10");
        keys.put("KEY_N","11");
        keys.put("KEY_O","12");
        keys.put("KEY_P","13");
        keys.put("KEY_Q","14");
        keys.put("KEY_R","15");
        keys.put("KEY_S","16");
        keys.put("KEY_T","17");
        keys.put("KEY_U","18");
        keys.put("KEY_V","19");
        keys.put("KEY_W","1A");
        keys.put("KEY_X","1B");
        keys.put("KEY_Y","1C");
        keys.put("KEY_Z","1D");
        keys.put("KEY_1","1E");
        keys.put("KEY_2","1F");
        keys.put("KEY_3","20");
        keys.put("KEY_4","21");
        keys.put("KEY_5","22");
        keys.put("KEY_6","23");
        keys.put("KEY_7","24");
        keys.put("KEY_8","25");
        keys.put("KEY_9","26");
        keys.put("KEY_0","27");
        keys.put("KEY_ENTER","28");
        keys.put("KEY_ESC","29");
        keys.put("KEY_BACKSPACE","2A");
        keys.put("KEY_TAB","2B");
        keys.put("KEY_SPACE","2C");
        keys.put("KEY_MINUS","2D");
        keys.put("KEY_EQUAL","2E");
        keys.put("KEY_LEFTBRACE","2F");
        keys.put("KEY_RIGHTBRACE","30");
        keys.put("KEY_BACKSLASH","31");
        keys.put("KEY_TILDE","32");
        keys.put("KEY_SEMICOLON","33");
        keys.put("KEY_QUOTE","34");
        keys.put("KEY_GRAVE","35");
        keys.put("KEY_COMMA","36");
        keys.put("KEY_PERIOD","37");
        keys.put("KEY_SLASH","38");
        keys.put("KEY_CAPSLOCK","39");
        keys.put("KEY_F1","3A");
        keys.put("KEY_F2","3B");
        keys.put("KEY_F3","3C");
        keys.put("KEY_F4","3D");
        keys.put("KEY_F5","3E");
        keys.put("KEY_F6","3F");
        keys.put("KEY_F7","40");
        keys.put("KEY_F8","41");
        keys.put("KEY_F9","42");
        keys.put("KEY_F10","43");
        keys.put("KEY_F11","44");
        keys.put("KEY_F12","45");
        keys.put("KEY_SYSRQ","46");
        keys.put("KEY_SCROLLLOCK","47");
        keys.put("KEY_PAUSE","48");
        keys.put("KEY_INSERT","49");
        keys.put("KEY_HOME","4a");
        keys.put("KEY_PAGEUP","4b");
        keys.put("KEY_DELETE","4c");
        keys.put("KEY_END","4d");
        keys.put("KEY_PAGEDOWN","4e");
        keys.put("KEY_RIGHT","4f");
        keys.put("KEY_LEFT","50");
        keys.put("KEY_DOWN","51");
        keys.put("KEY_UP","52");
        keys.put("KEY_NUMLOCK","53");
        keys.put("KEY_KPSLASH","54");
        keys.put("KEY_KPASTERISK","55");
        keys.put("KEY_KPMINUS","56");
        keys.put("KEY_KPPLUS","57");
        keys.put("KEY_KPENTER","58");
        keys.put("KEY_KP1","59");
        keys.put("KEY_KP2","5a");
        keys.put("KEY_KP3","5b");
        keys.put("KEY_KP4","5c");
        keys.put("KEY_KP5","5d");
        keys.put("KEY_KP6","5e");
        keys.put("KEY_KP7","5f");
        keys.put("KEY_KP8","60");
        keys.put("KEY_KP9","61");
        keys.put("KEY_KP0","62");
        keys.put("KEY_KPDOT","63");
        keys.put("KEY_102ND","64");
        keys.put("KEY_COMPOSE","65");
        keys.put("KEY_POWER","66");
        keys.put("KEY_KPEQUAL","67");
        keys.put("KEY_F13","68");
        keys.put("KEY_F14","69");
        keys.put("KEY_F15","6a");
        keys.put("KEY_F16","6b");
        keys.put("KEY_F17","6c");
        keys.put("KEY_F18","6d");
        keys.put("KEY_F19","6e");
        keys.put("KEY_F20","6f");
        keys.put("KEY_F21","70");
        keys.put("KEY_F22","71");
        keys.put("KEY_F23","72");
        keys.put("KEY_F24","73");
        keys.put("KEY_OPEN","74");
        keys.put("KEY_HELP","75");
        keys.put("KEY_PROPS","76");
        keys.put("KEY_FRONT","77");
        keys.put("KEY_STOP","78");
        keys.put("KEY_AGAIN","79");
        keys.put("KEY_UNDO","7a");
        keys.put("KEY_CUT","7b");
        keys.put("KEY_COPY","7c");
        keys.put("KEY_PASTE","7d");
        keys.put("KEY_FIND","7e");
        keys.put("KEY_MUTE","7f");
        keys.put("KEY_VOLUMEUP","80");
        keys.put("KEY_VOLUMEDOWN","81");
        keys.put("KEY_KPLEFTPAREN","b6");
        keys.put("KEY_KPRIGHTPAREN","b7");
        keys.put("KEY_LEFTCTRL","e0");
        keys.put("KEY_LEFTSHIFT","e1");
        keys.put("KEY_LEFTALT","e2");
        keys.put("KEY_LEFTMETA","e3");
        keys.put("KEY_RIGHTCTRL","e4");
        keys.put("KEY_RIGHTSHIFT","e5");
        keys.put("KEY_RIGHTALT","e6");
        keys.put("KEY_RIGHTMETA","e7");
        keys.put("KEY_MEDIA_PLAYPAUSE","e8");
        keys.put("KEY_MEDIA_STOPCD","e9");
        keys.put("KEY_MEDIA_PREVIOUSSONG","ea");
        keys.put("KEY_MEDIA_NEXTSONG","eb");
        keys.put("KEY_MEDIA_EJECTCD","ec");
        keys.put("KEY_MEDIA_VOLUMEUP","ed");
        keys.put("KEY_MEDIA_VOLUMEDOWN","ee");
        keys.put("KEY_MEDIA_MUTE","ef");
        keys.put("KEY_MEDIA_WWW","f0");
        keys.put("KEY_MEDIA_BACK","f1");
        keys.put("KEY_MEDIA_FORWARD","f2");
        keys.put("KEY_MEDIA_STOP","f3");
        keys.put("KEY_MEDIA_FIND","f4");
        keys.put("KEY_MEDIA_SCROLLUP","f5");
        keys.put("KEY_MEDIA_SCROLLDOWN","f6");
        keys.put("KEY_MEDIA_EDIT","f7");
        keys.put("KEY_MEDIA_SLEEP","f8");
        keys.put("KEY_MEDIA_COFFEE","f9");
        keys.put("KEY_MEDIA_REFRESH","fa");
        keys.put("KEY_MEDIA_CALC","fb");
    }

    private void defineUS() {
        keycodes.put("ASCII_20",kbbyteCode(keys.get("KEY_SPACE")));
        keycodes.put("ASCII_21",kbbyteCode(keys.get("KEY_1"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_22",kbbyteCode(keys.get("KEY_QUOTE"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_23",kbbyteCode(keys.get("KEY_3"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_24",kbbyteCode(keys.get("KEY_4"), keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_25",kbbyteCode(keys.get("KEY_5"), keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_26",kbbyteCode(keys.get("KEY_7"), keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_27",kbbyteCode(keys.get("KEY_QUOTE")));
        keycodes.put("ASCII_28",kbbyteCode(keys.get("KEY_9"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_29",kbbyteCode(keys.get("KEY_0"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_2A",kbbyteCode(keys.get("KEY_8"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_2B",kbbyteCode(keys.get("KEY_EQUAL"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_2C",kbbyteCode(keys.get("KEY_COMMA")));
        keycodes.put("ASCII_2D",kbbyteCode(keys.get("KEY_MINUS")));
        keycodes.put("ASCII_2E",kbbyteCode(keys.get("KEY_PERIOD")));
        keycodes.put("ASCII_2F",kbbyteCode(keys.get("KEY_SLASH")));
        keycodes.put("ASCII_30",kbbyteCode(keys.get("KEY_0")));
        keycodes.put("ASCII_31",kbbyteCode(keys.get("KEY_1")));
        keycodes.put("ASCII_32",kbbyteCode(keys.get("KEY_2")));
        keycodes.put("ASCII_33",kbbyteCode(keys.get("KEY_3")));
        keycodes.put("ASCII_34",kbbyteCode(keys.get("KEY_4")));
        keycodes.put("ASCII_35",kbbyteCode(keys.get("KEY_5")));
        keycodes.put("ASCII_36",kbbyteCode(keys.get("KEY_6")));
        keycodes.put("ASCII_37",kbbyteCode(keys.get("KEY_7")));
        keycodes.put("ASCII_38",kbbyteCode(keys.get("KEY_8")));
        keycodes.put("ASCII_39",kbbyteCode(keys.get("KEY_9")));
        keycodes.put("ASCII_3A",kbbyteCode(keys.get("KEY_SEMICOLON"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_3B",kbbyteCode(keys.get("KEY_SEMICOLON")));
        keycodes.put("ASCII_3C",kbbyteCode(keys.get("KEY_COMMA"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_3D",kbbyteCode(keys.get("KEY_EQUAL")));
        keycodes.put("ASCII_3E",kbbyteCode(keys.get("KEY_PERIOD"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_3F",kbbyteCode(keys.get("KEY_SLASH"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_40",kbbyteCode(keys.get("KEY_2"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_41",kbbyteCode(keys.get("KEY_A"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_42",kbbyteCode(keys.get("KEY_B"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_43",kbbyteCode(keys.get("KEY_C"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_44",kbbyteCode(keys.get("KEY_D"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_45",kbbyteCode(keys.get("KEY_E"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_46",kbbyteCode(keys.get("KEY_F"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_47",kbbyteCode(keys.get("KEY_G"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_48",kbbyteCode(keys.get("KEY_H"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_49",kbbyteCode(keys.get("KEY_I"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_4A",kbbyteCode(keys.get("KEY_J"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_4B",kbbyteCode(keys.get("KEY_K"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_4C",kbbyteCode(keys.get("KEY_L"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_4D",kbbyteCode(keys.get("KEY_M"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_4E",kbbyteCode(keys.get("KEY_N"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_4F",kbbyteCode(keys.get("KEY_O"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_50",kbbyteCode(keys.get("KEY_P"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_51",kbbyteCode(keys.get("KEY_Q"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_52",kbbyteCode(keys.get("KEY_R"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_53",kbbyteCode(keys.get("KEY_S"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_54",kbbyteCode(keys.get("KEY_T"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_55",kbbyteCode(keys.get("KEY_U"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_56",kbbyteCode(keys.get("KEY_V"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_57",kbbyteCode(keys.get("KEY_W"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_58",kbbyteCode(keys.get("KEY_X"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_59",kbbyteCode(keys.get("KEY_Y"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_5A",kbbyteCode(keys.get("KEY_Z"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_5B",kbbyteCode(keys.get("KEY_LEFTBRACE")));
        keycodes.put("ASCII_5C",kbbyteCode(keys.get("KEY_BACKSLASH")));
        keycodes.put("ASCII_5D",kbbyteCode(keys.get("KEY_RIGHTBRACE")));
        keycodes.put("ASCII_5E",kbbyteCode(keys.get("KEY_6"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_5F",kbbyteCode(keys.get("KEY_MINUS"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_60",kbbyteCode(keys.get("KEY_TILDE")));
        keycodes.put("ASCII_61",kbbyteCode(keys.get("KEY_A")));
        keycodes.put("ASCII_62",kbbyteCode(keys.get("KEY_B")));
        keycodes.put("ASCII_63",kbbyteCode(keys.get("KEY_C")));
        keycodes.put("ASCII_64",kbbyteCode(keys.get("KEY_D")));
        keycodes.put("ASCII_65",kbbyteCode(keys.get("KEY_E")));
        keycodes.put("ASCII_66",kbbyteCode(keys.get("KEY_F")));
        keycodes.put("ASCII_67",kbbyteCode(keys.get("KEY_G")));
        keycodes.put("ASCII_68",kbbyteCode(keys.get("KEY_H")));
        keycodes.put("ASCII_69",kbbyteCode(keys.get("KEY_I")));
        keycodes.put("ASCII_6A",kbbyteCode(keys.get("KEY_J")));
        keycodes.put("ASCII_6B",kbbyteCode(keys.get("KEY_K")));
        keycodes.put("ASCII_6C",kbbyteCode(keys.get("KEY_L")));
        keycodes.put("ASCII_6D",kbbyteCode(keys.get("KEY_M")));
        keycodes.put("ASCII_6E",kbbyteCode(keys.get("KEY_N")));
        keycodes.put("ASCII_6F",kbbyteCode(keys.get("KEY_O")));
        keycodes.put("ASCII_70",kbbyteCode(keys.get("KEY_P")));
        keycodes.put("ASCII_71",kbbyteCode(keys.get("KEY_Q")));
        keycodes.put("ASCII_72",kbbyteCode(keys.get("KEY_R")));
        keycodes.put("ASCII_73",kbbyteCode(keys.get("KEY_S")));
        keycodes.put("ASCII_74",kbbyteCode(keys.get("KEY_T")));
        keycodes.put("ASCII_75",kbbyteCode(keys.get("KEY_U")));
        keycodes.put("ASCII_76",kbbyteCode(keys.get("KEY_V")));
        keycodes.put("ASCII_77",kbbyteCode(keys.get("KEY_W")));
        keycodes.put("ASCII_78",kbbyteCode(keys.get("KEY_X")));
        keycodes.put("ASCII_79",kbbyteCode(keys.get("KEY_Y")));
        keycodes.put("ASCII_7A",kbbyteCode(keys.get("KEY_Z")));
        keycodes.put("ASCII_7B",kbbyteCode(keys.get("KEY_LEFTBRACE"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_7C",kbbyteCode(keys.get("KEY_BACKSLASH"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_7D",kbbyteCode(keys.get("KEY_RIGHTBRACE"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_7E",kbbyteCode(keys.get("KEY_TILDE"),keys.get("MODIFIERKEY_SHIFT")));
        keycodes.put("ASCII_7F",kbbyteCode(keys.get("KEY_BACKSPACE")));
    }

    private String comboKeys(String k) {
        k = k.toLowerCase();
        switch (k) {
            case "esc": case "escape": return keys.get("KEY_ESC");
            case "enter": return keys.get("KEY_ENTER");
            case "space": return keys.get("KEY_SPACE");
            case "backspace": case "bksp": return keys.get("KEY_BACKSPACE");
            case "tab": return keys.get("KEY_TAB");
            case "insert": return keys.get("KEY_INSERT");
            case "delete": return keys.get("KEY_DELETE");
            case "pageup": return keys.get("KEY_PAGEUP");
            case "pagedown": return keys.get("KEY_PAGEDOWN");
            case "home": return keys.get("KEY_HOME");
            case "end": return keys.get("KEY_END");
            case "up": case "uparrow": return keys.get("KEY_UP");
            case "down": case "downarrow": return keys.get("KEY_DOWN");
            case "right": case "rightarrow": return keys.get("KEY_RIGHT");
            case "left": case "leftarrow": return keys.get("KEY_LEFT");
            case "break": case "pause": return keys.get("KEY_PAUSE");
            case "f1": return keys.get("KEY_F1");
            case "f2": return keys.get("KEY_F2");
            case "f3": return keys.get("KEY_F3");
            case "f4": return keys.get("KEY_F4");
            case "f5": return keys.get("KEY_F5");
            case "f6": return keys.get("KEY_F6");
            case "f7": return keys.get("KEY_F7");
            case "f8": return keys.get("KEY_F8");
            case "f9": return keys.get("KEY_F9");
            case "f10": return keys.get("KEY_F10");
            case "f11": return keys.get("KEY_F11");
            case "f12": return keys.get("KEY_F12");
            case "0": return keys.get("KEY_0");
            case "1": return keys.get("KEY_1");
            case "2": return keys.get("KEY_2");
            case "3": return keys.get("KEY_3");
            case "4": return keys.get("KEY_4");
            case "5": return keys.get("KEY_5");
            case "6": return keys.get("KEY_6");
            case "7": return keys.get("KEY_7");
            case "8": return keys.get("KEY_8");
            case "9": return keys.get("KEY_9");
            case "a": return keys.get("KEY_A");
            case "b": return keys.get("KEY_B");
            case "c": return keys.get("KEY_C");
            case "d": return keys.get("KEY_D");
            case "e": return keys.get("KEY_E");
            case "f": return keys.get("KEY_F");
            case "g": return keys.get("KEY_G");
            case "h": return keys.get("KEY_H");
            case "i": return keys.get("KEY_I");
            case "j": return keys.get("KEY_J");
            case "k": return keys.get("KEY_K");
            case "l": return keys.get("KEY_L");
            case "m": return keys.get("KEY_M");
            case "n": return keys.get("KEY_N");
            case "o": return keys.get("KEY_O");
            case "p": return keys.get("KEY_P");
            case "q": return keys.get("KEY_Q");
            case "r": return keys.get("KEY_R");
            case "s": return keys.get("KEY_S");
            case "t": return keys.get("KEY_T");
            case "u": return keys.get("KEY_U");
            case "v": return keys.get("KEY_V");
            case "w": return keys.get("KEY_W");
            case "x": return keys.get("KEY_X");
            case "y": return keys.get("KEY_Y");
            case "z": return keys.get("KEY_Z");
            case "`": case "~": return keys.get("KEY_TILDE");
            case "[": case "{": return keys.get("KEY_LEFTBRACE");
            case "]": case "}": return keys.get("KEY_RIGHTBRACE");
            case "\\": case "|": return keys.get("KEY_BACKSLASH");
            case ";": case ":": return keys.get("KEY_SEMICOLON");
            case "'": case "\"": return keys.get("KEY_QUOTE");
            case ",": case "<": return keys.get("KEY_COMMA");
            case ".": case ">": return keys.get("KEY_PERIOD");
            case "/": case "?": return keys.get("KEY_SLASH");
            case "-": case "_": return keys.get("KEY_MINUS");
            case "=": case "+": return keys.get("KEY_EQUAL");
        }
        return "00";
    }

    private void initLangMap(int l) {
        switch(l) {
            case us: defineUS(); break;
            case tr: break;
            case sv: break;
            case si: break;
            case ru: break;
            case pt: break;
            case no: break;
            case it: break;
            case hr: break;
            case gb: break;
            case fr: break;
            case fi: break;
            case es: break;
            case dk: break;
            case de: break;
            case ca: break;
            case br: break;
            case be: break;
            case hu: break;
            default: defineUS();break;
        }
    }

    private String kbbyteCode(@NonNull String... args) {
        String tmp;
        if(args.length == 1) {
            tmp = "echo \"\\\\x00\\\\x00\\\\x"+args[0]+"\\\\x00\\\\x00\\\\x00\\\\x00\\\\x00\" > /dev/hidg0\n";
            tmp += "echo \"\\\\x00\\\\x00\\\\x00\\\\x00\\\\x00\\\\x00\\\\x00\\\\x00\" > /dev/hidg0\n";
        } else if(args.length == 2) {
            tmp = "echo \"\\\\x"+args[1]+"\\\\x00\\\\x"+args[0]+"\\\\x00\\\\x00\\\\x00\\\\x00\\\\x00\" > /dev/hidg0\n";
            tmp += "echo \"\\\\x00\\\\x00\\\\x00\\\\x00\\\\x00\\\\x00\\\\x00\\\\x00\" > /dev/hidg0\n";
        } else {
            tmp = "echo \"\\\\x00\\\\x00\\\\x00\\\\x00\\\\x00\\\\x00\\\\x00\\\\x00\" > /dev/hidg0\n";
        }
        return tmp;
    }

    ArrayList<String> getCmd() {
        return shell;
    }

    void parse(@NonNull String str) {
        String[] lines = str.split("\\r?\\n");
        String con;
        for (int a = 0; a < lines.length; a++) {
            //DEFAULTDELAY or DEFAULT_DELAY
            if (a == 0 && (lines[a].startsWith("DEFAULTDELAY") || lines[a].startsWith("DEFAULT_DELAY"))) {
                con = lines[a];
                con = con.replace("DEFAULTDELAY ", "");
                con = con.replace("DEFAULT_DELAY ", "");
                defdelay = Float.parseFloat(con) / 1000;
            }
            //DELAY
            else if (lines[a].startsWith("DELAY")) {
                con = lines[a].replace("DELAY ", "");
                float delay = Float.parseFloat(con) / 1000;
                shell.add("sleep " + delay + "\n");
            }
            //REM
            else if (lines[a].startsWith("REM")) {
                continue;
            }
            //REPEAT
            else if (lines[a].startsWith("REPEAT")) {
                con = lines[a].replace("REPEAT ", "");
                int x = parseInt(con);
                for (int i = 0; i < x; i++) {
                    parse(lines[a - 1]);
                }
            }
            //STRING
            else if (lines[a].startsWith("STRING")) {
                con = lines[a].replace("STRING ", "");
                ArrayList<String> tmp = kblangbytes(con);
                shell.addAll(tmp);
            }
            //GUI or WINDOWS or COMMAND or META
            else if (lines[a].startsWith("GUI") || lines[a].startsWith("WINDOWS") ||
                    lines[a].startsWith("META") || lines[a].startsWith("COMMAND")) {
                con = lines[a];
                con = con.replace("GUI ","");
                con = con.replace("WINDOWS ", "");
                con = con.replace("META ","");
                con = con.replace("COMMAND ", "");
                shell.add(kbbyteCode(comboKeys(con),keys.get("MODIFIERKEY_GUI")));
            }
            //SHIFT & SHIFT+GUI & SHIFT+ALT & SHIFT+CTRL & SHIFT+CONTROL
            else if (lines[a].startsWith("SHIFT")) {
                con = lines[a];
                con = con.replace("SHIFT ","");
                if (con.startsWith("GUI") || con.startsWith("WINDOWS") ||
                        con.startsWith("META") || con.startsWith("COMMAND")) {
                    con = con.replace("GUI ","");
                    con = con.replace("WINDOWS ", "");
                    con = con.replace("META ","");
                    con = con.replace("COMMAND ", "");
                    shell.add(kbbyteCode(comboKeys(con),keys.get("MODIFIERKEY_SHIFT_GUI")));
                } else if (con.startsWith("ALT")) {
                    con = con.replace("ALT ","");
                    shell.add(kbbyteCode(comboKeys(con),keys.get("MODIFIERKEY_ALT_SHIFT")));
                } else if (con.startsWith("CTRL") || con.startsWith("CONTROL")) {
                    con = con.replace("CTRL ","");
                    con = con.replace("CONTROL ","");
                    shell.add(kbbyteCode(comboKeys(con),keys.get("MODIFIERKEY_CTRL_SHIFT")));
                } else {
                    shell.add(kbbyteCode(comboKeys(con),keys.get("MODIFIERKEY_SHIFT")));
                }
            }
            //ALT & ALT+SHIFT & ALT+CTRL & ALT+CONTROL
            else if (lines[a].startsWith("ALT")) {
                con = lines[a];
                con = con.replace("ALT ","");
                if (con.startsWith("CTRL") || con.startsWith("CONTROL")) {
                    con = con.replace("CTRL ","");
                    con = con.replace("CONTROL ","");
                    shell.add(kbbyteCode(comboKeys(con),keys.get("MODIFIERKEY_CTRL_ALT")));
                } else if (con.startsWith("SHIFT")) {
                    con = con.replace("SHIFT ","");
                    shell.add(kbbyteCode(comboKeys(con),keys.get("MODIFIERKEY_ALT_SHIFT")));
                } else {
                    shell.add(kbbyteCode(comboKeys(con),keys.get("MODIFIERKEY_ALT")));
                }
            }
            //CONTROL or CTRL & CONTROL+ALT or CTRL+ALT & CONTROL+SHIFT or CTRL+SHIFT
            else if (lines[a].startsWith("CTRL") || lines[a].startsWith("CONTROL")) {
                con = lines[a];
                con = con.replace("CTRL ","");
                con = con.replace("CONTROL ","");
                if (con.startsWith("ALT")) {
                    con = con.replace("ALT ","");
                    shell.add(kbbyteCode(comboKeys(con),keys.get("MODIFIERKEY_CTRL_ALT")));
                } else if (con.startsWith("SHIFT")) {
                    con = con.replace("SHIFT ","");
                    shell.add(kbbyteCode(comboKeys(con),keys.get("MODIFIERKEY_CTRL_SHIFT")));
                } else {
                    shell.add(kbbyteCode(comboKeys(con),keys.get("MODIFIERKEY_CTRL")));
                }
            }
            //MENU or APP
            else if (lines[a].startsWith("MENU") || lines[a].startsWith("APP")) {
                shell.add(kbbyteCode(keys.get("KEY_F10"),keys.get("MODIFIERKEY_SHIFT")));
            }
            //DOWNARROW or DOWN
            else if (lines[a].startsWith("DOWN") || lines[a].startsWith("DOWNARROW")) {
                shell.add(kbbyteCode(keys.get("KEY_DOWN")));
            }
            //UPARROW or UP
            else if (lines[a].startsWith("UP") || lines[a].startsWith("UPARROW")) {
                shell.add(kbbyteCode(keys.get("KEY_UP")));
            }
            //LEFTARROW or LEFT
            else if (lines[a].startsWith("LEFT") || lines[a].startsWith("LEFTARROW")) {
                shell.add(kbbyteCode(keys.get("KEY_LEFT")));
            }
            //RIGHTARROW or RIGHT
            else if (lines[a].startsWith("RIGHT") || lines[a].startsWith("RIGHTARROW")) {
                shell.add(kbbyteCode(keys.get("KEY_RIGHT")));
            }
            //DELETE
            else if (lines[a].startsWith("DELETE")) {
                shell.add(kbbyteCode(keys.get("KEY_DELETE")));
            }
            //END
            else if (lines[a].startsWith("END")) {
                shell.add(kbbyteCode(keys.get("KEY_END")));
            }
            //HOME
            else if (lines[a].startsWith("HOME")) {
                shell.add(kbbyteCode(keys.get("KEY_HOME")));
            }
            //INSERT
            else if (lines[a].startsWith("INSERT")) {
                shell.add(kbbyteCode(keys.get("KEY_INSERT")));
            }
            //PAGEUP
            else if (lines[a].startsWith("PAGEUP")) {
                shell.add(kbbyteCode(keys.get("KEY_PAGEUP")));
            }
            //PAGEDOWN
            else if (lines[a].startsWith("PAGEDOWN")) {
                shell.add(kbbyteCode(keys.get("KEY_PAGEDOWN")));
            }
            //PRINTSCREEN or PRINTSCRN or PRNTSCRN or PRTSCN or PRSC or PRTSCR
            else if (lines[a].startsWith("PRINTSCREEN") || lines[a].startsWith("PRINTSCRN") ||
                    lines[a].startsWith("PRNTSCRN") || lines[a].startsWith("PRTSCN") ||
                    lines[a].startsWith("PRSC") || lines[a].startsWith("PRTSCR")) {
                shell.add(kbbyteCode(keys.get("KEY_SYSRQ")));
            }
            //BREAK or PAUSE
            else if (lines[a].startsWith("BREAK") || lines[a].startsWith("PAUSE")) {
                shell.add(kbbyteCode(keys.get("KEY_PAUSE")));
            }
            //NUMLOCK
            else if (lines[a].startsWith("NUMLOCK")) {
                shell.add(kbbyteCode(keys.get("KEY_NUMLOCK")));
            }
            //CAPSLOCK
            else if (lines[a].startsWith("CAPSLOCK")) {
                shell.add(kbbyteCode(keys.get("KEY_CAPSLOCK")));
            }
            //SCROLLLOCK
            else if (lines[a].startsWith("SCROLLLOCK")) {
                shell.add(kbbyteCode(keys.get("KEY_SCROLLLOCK")));
            }
            //ESC or ESCAPE
            else if (lines[a].startsWith("ESCAPE") || lines[a].startsWith("ESC")) {
                shell.add(kbbyteCode(keys.get("KEY_ESC")));
            }
            //SPACE
            else if (lines[a].startsWith("SPACE")) {
                shell.add(kbbyteCode(keys.get("KEY_SPACE")));
            }
            //TAB
            else if (lines[a].startsWith("TAB")) {
                shell.add(kbbyteCode(keys.get("KEY_TAB")));
            }
            //BACKSPACE or BKSP
            else if (lines[a].startsWith("BACKSPACE") || lines[a].startsWith("BKSP")) {
                shell.add(kbbyteCode(keys.get("KEY_BACKSPACE")));
            }
            //ENTER
            else if (lines[a].startsWith("ENTER")) {
                shell.add(kbbyteCode(keys.get("KEY_ENTER")));
            }
            shell.add("sleep " + defdelay + "\n");
        }
    }

    private ArrayList<String> kblangbytes(@NonNull String str) {
        ArrayList<String> kbstrokes = new ArrayList<>();
        char[] ch = str.toCharArray();
        for (char aCh : ch) {
            //ASCII characters
            switch (aCh) {
                case '\u0020':
                    if (keycodes.containsKey("ASCII_20")) kbstrokes.add(keycodes.get("ASCII_20"));
                    break;
                case '\u0021':
                    if (keycodes.containsKey("ASCII_21")) kbstrokes.add(keycodes.get("ASCII_21"));
                    else if (keycodes.containsKey("ISO_8859_5_21"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_21"));
                    break;
                case '\u0022':
                    if (keycodes.containsKey("ASCII_22")) kbstrokes.add(keycodes.get("ASCII_22"));
                    break;
                case '\u0023':
                    if (keycodes.containsKey("ASCII_23")) kbstrokes.add(keycodes.get("ASCII_23"));
                    break;
                case '\u0024':
                    if (keycodes.containsKey("ASCII_24")) kbstrokes.add(keycodes.get("ASCII_24"));
                    else if (keycodes.containsKey("ISO_8859_5_24"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_24"));
                    break;
                case '\u0025':
                    if (keycodes.containsKey("ASCII_25")) kbstrokes.add(keycodes.get("ASCII_25"));
                    else if (keycodes.containsKey("ISO_8859_5_25"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_25"));
                    break;
                case '\u0026':
                    if (keycodes.containsKey("ASCII_26")) kbstrokes.add(keycodes.get("ASCII_26"));
                    break;
                case '\'':
                    if (keycodes.containsKey("ASCII_27")) kbstrokes.add(keycodes.get("ASCII_27"));
                    break;
                case '\u0028':
                    if (keycodes.containsKey("ASCII_28")) kbstrokes.add(keycodes.get("ASCII_28"));
                    else if (keycodes.containsKey("ISO_8859_5_28"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_28"));
                    break;
                case '\u0029':
                    if (keycodes.containsKey("ASCII_29")) kbstrokes.add(keycodes.get("ASCII_29"));
                    else if (keycodes.containsKey("ISO_8859_5_29"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_29"));
                    break;
                case '\u002A':
                    if (keycodes.containsKey("ASCII_2A")) kbstrokes.add(keycodes.get("ASCII_2A"));
                    else if (keycodes.containsKey("ISO_8859_5_2A"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_2A"));
                    break;
                case '\u002B':
                    if (keycodes.containsKey("ASCII_2B")) kbstrokes.add(keycodes.get("ASCII_2B"));
                    break;
                case '\u002C':
                    if (keycodes.containsKey("ASCII_2C")) kbstrokes.add(keycodes.get("ASCII_2C"));
                    else if (keycodes.containsKey("ISO_8859_5_2C"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_2C"));
                    break;
                case '\u002D':
                    if (keycodes.containsKey("ASCII_2D")) kbstrokes.add(keycodes.get("ASCII_2D"));
                    else if (keycodes.containsKey("ISO_8859_5_2D"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_2D"));
                    break;
                case '\u002E':
                    if (keycodes.containsKey("ASCII_2E")) kbstrokes.add(keycodes.get("ASCII_2E"));
                    else if (keycodes.containsKey("ISO_8859_5_2E"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_2E"));
                    break;
                case '\u002F':
                    if (keycodes.containsKey("ASCII_2F")) kbstrokes.add(keycodes.get("ASCII_2F"));
                    else if (keycodes.containsKey("ISO_8859_5_2F"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_2F"));
                    break;
                case '\u0030':
                    if (keycodes.containsKey("ASCII_30")) kbstrokes.add(keycodes.get("ASCII_30"));
                    else if (keycodes.containsKey("ISO_8859_5_30"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_30"));
                    break;
                case '\u0031':
                    if (keycodes.containsKey("ASCII_31")) kbstrokes.add(keycodes.get("ASCII_31"));
                    else if (keycodes.containsKey("ISO_8859_5_31"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_31"));
                    break;
                case '\u0032':
                    if (keycodes.containsKey("ASCII_32")) kbstrokes.add(keycodes.get("ASCII_32"));
                    else if (keycodes.containsKey("ISO_8859_5_32"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_32"));
                    break;
                case '\u0033':
                    if (keycodes.containsKey("ASCII_33")) kbstrokes.add(keycodes.get("ASCII_33"));
                    else if (keycodes.containsKey("ISO_8859_5_33"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_33"));
                    break;
                case '\u0034':
                    if (keycodes.containsKey("ASCII_34")) kbstrokes.add(keycodes.get("ASCII_34"));
                    else if (keycodes.containsKey("ISO_8859_5_34"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_34"));
                    break;
                case '\u0035':
                    if (keycodes.containsKey("ASCII_35")) kbstrokes.add(keycodes.get("ASCII_35"));
                    else if (keycodes.containsKey("ISO_8859_5_35"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_35"));
                    break;
                case '\u0036':
                    if (keycodes.containsKey("ASCII_36")) kbstrokes.add(keycodes.get("ASCII_36"));
                    else if (keycodes.containsKey("ISO_8859_5_36"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_36"));
                    break;
                case '\u0037':
                    if (keycodes.containsKey("ASCII_37")) kbstrokes.add(keycodes.get("ASCII_37"));
                    else if (keycodes.containsKey("ISO_8859_5_37"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_37"));
                    break;
                case '\u0038':
                    if (keycodes.containsKey("ASCII_38")) kbstrokes.add(keycodes.get("ASCII_38"));
                    else if (keycodes.containsKey("ISO_8859_5_38"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_38"));
                    break;
                case '\u0039':
                    if (keycodes.containsKey("ASCII_39")) kbstrokes.add(keycodes.get("ASCII_39"));
                    else if (keycodes.containsKey("ISO_8859_5_39"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_39"));
                    break;
                case '\u003A':
                    if (keycodes.containsKey("ASCII_3A")) kbstrokes.add(keycodes.get("ASCII_3A"));
                    else if (keycodes.containsKey("ISO_8859_5_3A"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_3A"));
                    break;
                case '\u003B':
                    if (keycodes.containsKey("ASCII_3B")) kbstrokes.add(keycodes.get("ASCII_3B"));
                    else if (keycodes.containsKey("ISO_8859_5_3B"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_3B"));
                    break;
                case '\u003C':
                    if (keycodes.containsKey("ASCII_3C")) kbstrokes.add(keycodes.get("ASCII_3C"));
                    break;
                case '\u003D':
                    if (keycodes.containsKey("ASCII_3D")) kbstrokes.add(keycodes.get("ASCII_3D"));
                    break;
                case '\u003E':
                    if (keycodes.containsKey("ASCII_3E")) kbstrokes.add(keycodes.get("ASCII_3E"));
                    break;
                case '\u003F':
                    if (keycodes.containsKey("ASCII_3F")) kbstrokes.add(keycodes.get("ASCII_3F"));
                    else if (keycodes.containsKey("ISO_8859_5_3F"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_3F"));
                    break;
                case '\u0040':
                    if (keycodes.containsKey("ASCII_40")) kbstrokes.add(keycodes.get("ASCII_40"));
                    break;
                case '\u0041':
                    if (keycodes.containsKey("ASCII_41")) kbstrokes.add(keycodes.get("ASCII_41"));
                    break;
                case '\u0042':
                    if (keycodes.containsKey("ASCII_42")) kbstrokes.add(keycodes.get("ASCII_42"));
                    break;
                case '\u0043':
                    if (keycodes.containsKey("ASCII_43")) kbstrokes.add(keycodes.get("ASCII_43"));
                    break;
                case '\u0044':
                    if (keycodes.containsKey("ASCII_44")) kbstrokes.add(keycodes.get("ASCII_44"));
                    break;
                case '\u0045':
                    if (keycodes.containsKey("ASCII_45")) kbstrokes.add(keycodes.get("ASCII_45"));
                    break;
                case '\u0046':
                    if (keycodes.containsKey("ASCII_46")) kbstrokes.add(keycodes.get("ASCII_46"));
                    break;
                case '\u0047':
                    if (keycodes.containsKey("ASCII_47")) kbstrokes.add(keycodes.get("ASCII_47"));
                    break;
                case '\u0048':
                    if (keycodes.containsKey("ASCII_48")) kbstrokes.add(keycodes.get("ASCII_48"));
                    break;
                case '\u0049':
                    if (keycodes.containsKey("ASCII_49")) kbstrokes.add(keycodes.get("ASCII_49"));
                    break;
                case '\u004A':
                    if (keycodes.containsKey("ASCII_4A")) kbstrokes.add(keycodes.get("ASCII_4A"));
                    break;
                case '\u004B':
                    if (keycodes.containsKey("ASCII_4B")) kbstrokes.add(keycodes.get("ASCII_4B"));
                    break;
                case '\u004C':
                    if (keycodes.containsKey("ASCII_4C")) kbstrokes.add(keycodes.get("ASCII_4C"));
                    break;
                case '\u004D':
                    if (keycodes.containsKey("ASCII_4D")) kbstrokes.add(keycodes.get("ASCII_4D"));
                    break;
                case '\u004E':
                    if (keycodes.containsKey("ASCII_4E")) kbstrokes.add(keycodes.get("ASCII_4E"));
                    break;
                case '\u004F':
                    if (keycodes.containsKey("ASCII_4F")) kbstrokes.add(keycodes.get("ASCII_4F"));
                    break;
                case '\u0050':
                    if (keycodes.containsKey("ASCII_50")) kbstrokes.add(keycodes.get("ASCII_50"));
                    break;
                case '\u0051':
                    if (keycodes.containsKey("ASCII_51")) kbstrokes.add(keycodes.get("ASCII_51"));
                    break;
                case '\u0052':
                    if (keycodes.containsKey("ASCII_52")) kbstrokes.add(keycodes.get("ASCII_52"));
                    break;
                case '\u0053':
                    if (keycodes.containsKey("ASCII_53")) kbstrokes.add(keycodes.get("ASCII_53"));
                    break;
                case '\u0054':
                    if (keycodes.containsKey("ASCII_54")) kbstrokes.add(keycodes.get("ASCII_54"));
                    break;
                case '\u0055':
                    if (keycodes.containsKey("ASCII_55")) kbstrokes.add(keycodes.get("ASCII_55"));
                    break;
                case '\u0056':
                    if (keycodes.containsKey("ASCII_56")) kbstrokes.add(keycodes.get("ASCII_56"));
                    break;
                case '\u0057':
                    if (keycodes.containsKey("ASCII_57")) kbstrokes.add(keycodes.get("ASCII_57"));
                    break;
                case '\u0058':
                    if (keycodes.containsKey("ASCII_58")) kbstrokes.add(keycodes.get("ASCII_58"));
                    break;
                case '\u0059':
                    if (keycodes.containsKey("ASCII_59")) kbstrokes.add(keycodes.get("ASCII_59"));
                    break;
                case '\u005A':
                    if (keycodes.containsKey("ASCII_5A")) kbstrokes.add(keycodes.get("ASCII_5A"));
                    break;
                case '\u005B':
                    if (keycodes.containsKey("ASCII_5B")) kbstrokes.add(keycodes.get("ASCII_5B"));
                    break;
                case '\\':
                    if (keycodes.containsKey("ASCII_5C")) kbstrokes.add(keycodes.get("ASCII_5C"));
                    break;
                case '\u005D':
                    if (keycodes.containsKey("ASCII_5D")) kbstrokes.add(keycodes.get("ASCII_5D"));
                    break;
                case '\u005E':
                    if (keycodes.containsKey("ASCII_5E")) kbstrokes.add(keycodes.get("ASCII_5E"));
                    break;
                case '\u005F':
                    if (keycodes.containsKey("ASCII_5F")) kbstrokes.add(keycodes.get("ASCII_5F"));
                    else if (keycodes.containsKey("ISO_8859_5_5F"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_5F"));
                    break;
                case '\u0060':
                    if (keycodes.containsKey("ASCII_60")) kbstrokes.add(keycodes.get("ASCII_60"));
                    break;
                case '\u0061':
                    if (keycodes.containsKey("ASCII_61")) kbstrokes.add(keycodes.get("ASCII_61"));
                    break;
                case '\u0062':
                    if (keycodes.containsKey("ASCII_62")) kbstrokes.add(keycodes.get("ASCII_62"));
                    break;
                case '\u0063':
                    if (keycodes.containsKey("ASCII_63")) kbstrokes.add(keycodes.get("ASCII_63"));
                    break;
                case '\u0064':
                    if (keycodes.containsKey("ASCII_64")) kbstrokes.add(keycodes.get("ASCII_64"));
                    break;
                case '\u0065':
                    if (keycodes.containsKey("ASCII_65")) kbstrokes.add(keycodes.get("ASCII_65"));
                    break;
                case '\u0066':
                    if (keycodes.containsKey("ASCII_66")) kbstrokes.add(keycodes.get("ASCII_66"));
                    break;
                case '\u0067':
                    if (keycodes.containsKey("ASCII_67")) kbstrokes.add(keycodes.get("ASCII_67"));
                    break;
                case '\u0068':
                    if (keycodes.containsKey("ASCII_68")) kbstrokes.add(keycodes.get("ASCII_68"));
                    break;
                case '\u0069':
                    if (keycodes.containsKey("ASCII_69")) kbstrokes.add(keycodes.get("ASCII_69"));
                    break;
                case '\u006A':
                    if (keycodes.containsKey("ASCII_6A")) kbstrokes.add(keycodes.get("ASCII_6A"));
                    break;
                case '\u006B':
                    if (keycodes.containsKey("ASCII_6B")) kbstrokes.add(keycodes.get("ASCII_6B"));
                    break;
                case '\u006C':
                    if (keycodes.containsKey("ASCII_6C")) kbstrokes.add(keycodes.get("ASCII_6C"));
                    break;
                case '\u006D':
                    if (keycodes.containsKey("ASCII_6D")) kbstrokes.add(keycodes.get("ASCII_6D"));
                    break;
                case '\u006E':
                    if (keycodes.containsKey("ASCII_6E")) kbstrokes.add(keycodes.get("ASCII_6E"));
                    break;
                case '\u006F':
                    if (keycodes.containsKey("ASCII_6F")) kbstrokes.add(keycodes.get("ASCII_6F"));
                    break;
                case '\u0070':
                    if (keycodes.containsKey("ASCII_70")) kbstrokes.add(keycodes.get("ASCII_70"));
                    break;
                case '\u0071':
                    if (keycodes.containsKey("ASCII_71")) kbstrokes.add(keycodes.get("ASCII_71"));
                    break;
                case '\u0072':
                    if (keycodes.containsKey("ASCII_72")) kbstrokes.add(keycodes.get("ASCII_72"));
                    break;
                case '\u0073':
                    if (keycodes.containsKey("ASCII_73")) kbstrokes.add(keycodes.get("ASCII_73"));
                    break;
                case '\u0074':
                    if (keycodes.containsKey("ASCII_74")) kbstrokes.add(keycodes.get("ASCII_74"));
                    break;
                case '\u0075':
                    if (keycodes.containsKey("ASCII_75")) kbstrokes.add(keycodes.get("ASCII_75"));
                    break;
                case '\u0076':
                    if (keycodes.containsKey("ASCII_76")) kbstrokes.add(keycodes.get("ASCII_76"));
                    break;
                case '\u0077':
                    if (keycodes.containsKey("ASCII_77")) kbstrokes.add(keycodes.get("ASCII_77"));
                    break;
                case '\u0078':
                    if (keycodes.containsKey("ASCII_78")) kbstrokes.add(keycodes.get("ASCII_78"));
                    break;
                case '\u0079':
                    if (keycodes.containsKey("ASCII_79")) kbstrokes.add(keycodes.get("ASCII_79"));
                    break;
                case '\u007A':
                    if (keycodes.containsKey("ASCII_7A")) kbstrokes.add(keycodes.get("ASCII_7A"));
                    break;
                case '\u007B':
                    if (keycodes.containsKey("ASCII_7B")) kbstrokes.add(keycodes.get("ASCII_7B"));
                    break;
                case '\u007C':
                    if (keycodes.containsKey("ASCII_7C")) kbstrokes.add(keycodes.get("ASCII_7C"));
                    break;
                case '\u007D':
                    if (keycodes.containsKey("ASCII_7D")) kbstrokes.add(keycodes.get("ASCII_7D"));
                    break;
                case '\u007E':
                    if (keycodes.containsKey("ASCII_7E")) kbstrokes.add(keycodes.get("ASCII_7E"));
                    else if (keycodes.containsKey("ISO_8859_5_7E")) kbstrokes.add(keycodes.get("ISO_8859_5_7E"));
                    break;
                case '\u007F':
                    if (keycodes.containsKey("ASCII_7F")) kbstrokes.add(keycodes.get("ASCII_7F"));
                    break;
                /*
                //ISO_8859_1 characters
                case 0xc2a0:
                    if (keycodes.containsKey("ISO_8859_1_A0"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_A0"));
                    break;
                case 0xc2a2:
                    if (keycodes.containsKey("ISO_8859_1_A2"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_A2"));
                    break;
                case 0xc2a3:
                    if (keycodes.containsKey("ISO_8859_1_A3"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_A3"));
                    else if (keycodes.containsKey("ISO_8859_5_23"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_23"));
                    break;
                case 0xc2a4:
                    if (keycodes.containsKey("ISO_8859_1_A4"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_A4"));
                    else if (keycodes.containsKey("UNICODE_2D9"))
                        kbstrokes.add(keycodes.get("UNICODE_2D9"));
                    break;
                case 0xc2a6:
                    if (keycodes.containsKey("ISO_8859_1_A6"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_A6"));
                    break;
                case 0xc2a7:
                    if (keycodes.containsKey("ISO_8859_1_A7"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_A7"));
                    else if (keycodes.containsKey("UNICODE_2DD"))
                        kbstrokes.add(keycodes.get("UNICODE_2DD"));
                    break;
                case 0xc2a8:
                    if (keycodes.containsKey("ISO_8859_1_A8"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_A8"));
                    break;
                case 0xc2aa:
                    if (keycodes.containsKey("ISO_8859_1_AA"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_AA"));
                    break;
                case 0xc2ab:
                    if (keycodes.containsKey("ISO_8859_1_AB"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_AB"));
                    else if (keycodes.containsKey("ISO_8859_5_26"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_26"));
                    break;
                case 0xc2ac:
                    if (keycodes.containsKey("ISO_8859_1_AC"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_AC"));
                    break;
                case 0xc2ad:
                    if (keycodes.containsKey("ISO_8859_1_AD"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_AD"));
                    break;
                case 0xc2af:
                    if (keycodes.containsKey("ISO_8859_1_AF"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_AF"));
                    break;
                case 0xc2b0:
                    if (keycodes.containsKey("ISO_8859_1_B0"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_B0"));
                    break;
                case 0xc2b1:
                    if (keycodes.containsKey("ISO_8859_1_B1"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_B1"));
                    break;
                case 0xc2b2:
                    if (keycodes.containsKey("ISO_8859_1_B2"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_B2"));
                    break;
                case 0xc2b3:
                    if (keycodes.containsKey("ISO_8859_1_B3"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_B3"));
                    break;
                case 0xc2b4:
                    if (keycodes.containsKey("ISO_8859_1_B4"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_B4"));
                    break;
                case 0xc2b5:
                    if (keycodes.containsKey("ISO_8859_1_B5"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_B5"));
                    break;
                case 0xc2b6:
                    if (keycodes.containsKey("ISO_8859_1_B6"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_B6"));
                    break;
                case 0xc2b8:
                    if (keycodes.containsKey("ISO_8859_1_B8"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_B8"));
                    break;
                case 0xc2ba:
                    if (keycodes.containsKey("ISO_8859_1_BA"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_BA"));
                    break;
                case 0xc2bb:
                    if (keycodes.containsKey("ISO_8859_1_BB"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_BB"));
                    else if (keycodes.containsKey("ISO_8859_5_27"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_27"));
                    break;
                case 0xc2bc:
                    if (keycodes.containsKey("ISO_8859_1_BC"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_BC"));
                    break;
                case 0xc2bd:
                    if (keycodes.containsKey("ISO_8859_1_BD"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_BD"));
                    break;
                case 0xc2be:
                    if (keycodes.containsKey("ISO_8859_1_BE"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_BE"));
                    break;
                case 0xc384:
                    if (keycodes.containsKey("ISO_8859_1_C4"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_C4"));
                    break;
                case 0xc385:
                    if (keycodes.containsKey("ISO_8859_1_C5"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_C5"));
                    break;
                case 0xc386:
                    if (keycodes.containsKey("ISO_8859_1_C6"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_C6"));
                    break;
                case 0xc387:
                    if (keycodes.containsKey("ISO_8859_1_C7"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_C7"));
                    break;
                case 0xc389:
                    if (keycodes.containsKey("ISO_8859_1_C9"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_C9"));
                    break;
                case 0xc396:
                    if (keycodes.containsKey("ISO_8859_1_D6"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_D6"));
                    break;
                case 0xc397:
                    if (keycodes.containsKey("ISO_8859_1_D7"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_D7"));
                    else if (keycodes.containsKey("UNICODE_141"))
                        kbstrokes.add(keycodes.get("UNICODE_141"));
                    break;
                case 0xc398:
                    if (keycodes.containsKey("ISO_8859_1_D8"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_D8"));
                    break;
                case 0xc39c:
                    if (keycodes.containsKey("ISO_8859_1_DC"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_DC"));
                    break;
                case 0xc39f:
                    if (keycodes.containsKey("ISO_8859_1_DF"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_DF"));
                    else if (keycodes.containsKey("UNICODE_2DB"))
                        kbstrokes.add(keycodes.get("UNICODE_2DB"));
                    break;
                case 0xc3a0:
                    if (keycodes.containsKey("ISO_8859_1_E0"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_E0"));
                    break;
                case 0xc3a4:
                    if (keycodes.containsKey("ISO_8859_1_E4"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_E4"));
                    break;
                case 0xc3a5:
                    if (keycodes.containsKey("ISO_8859_1_E5"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_E5"));
                    break;
                case 0xc3a6:
                    if (keycodes.containsKey("ISO_8859_1_E6"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_E6"));
                    break;
                case 0xc3a7:
                    if (keycodes.containsKey("ISO_8859_1_E7"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_E7"));
                    break;
                case 0xc3a8:
                    if (keycodes.containsKey("ISO_8859_1_E8"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_E8"));
                    break;
                case 0xc3a9:
                    if (keycodes.containsKey("ISO_8859_1_E9"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_E9"));
                    break;
                case 0xc3ac:
                    if (keycodes.containsKey("ISO_8859_1_EC"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_EC"));
                    break;
                case 0xc3ad:
                    if (keycodes.containsKey("ISO_8859_1_ED"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_ED"));
                    break;
                case 0xc3b0:
                    if (keycodes.containsKey("ISO_8859_1_F0"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_F0"));
                    break;
                case 0xc3b2:
                    if (keycodes.containsKey("ISO_8859_1_F2"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_F2"));
                    break;
                case 0xc3b3:
                    if (keycodes.containsKey("ISO_8859_1_F3"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_F3"));
                    break;
                case 0xc3b6:
                    if (keycodes.containsKey("ISO_8859_1_F6"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_F6"));
                    break;
                case 0xc3b7:
                    if (keycodes.containsKey("ISO_8859_1_F7"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_F7"));
                    else if (keycodes.containsKey("UNICODE_142"))
                        kbstrokes.add(keycodes.get("UNICODE_142"));
                    break;
                case 0xc3b8:
                    if (keycodes.containsKey("ISO_8859_1_F8"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_F8"));
                    break;
                case 0xc3b9:
                    if (keycodes.containsKey("ISO_8859_1_F9"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_F9"));
                    break;
                case 0xc3ba:
                    if (keycodes.containsKey("ISO_8859_1_FA"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_FA"));
                    break;
                case 0xc3bc:
                    if (keycodes.containsKey("ISO_8859_1_FC"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_FC"));
                    break;
                case 0xc3be:
                    if (keycodes.containsKey("ISO_8859_1_FE"))
                        kbstrokes.add(keycodes.get("ISO_8859_1_FE"));
                    //ISO_8859_5 characters
                    break;
                case 0xd191:
                    if (keycodes.containsKey("ISO_8859_5_F1"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_F1"));
                    break;
                case 0xd081:
                    if (keycodes.containsKey("ISO_8859_5_A1"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_A1"));
                    break;
                case 0xe2809c:
                    if (keycodes.containsKey("ISO_8859_5_22"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_22"));
                    break;
                case 0xd18a:
                    if (keycodes.containsKey("ISO_8859_5_CA"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_CA"));
                    break;
                case 0xd0aa:
                    if (keycodes.containsKey("ISO_8859_5_EA"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_EA"));
                    break;
                case 0xd0af:
                    if (keycodes.containsKey("ISO_8859_5_CF"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_CF"));
                    break;
                case 0xd18f:
                    if (keycodes.containsKey("ISO_8859_5_EF"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_EF"));
                    break;
                case 0xd0a8:
                    if (keycodes.containsKey("ISO_8859_5_C8"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_C8"));
                    break;
                case 0xd188:
                    if (keycodes.containsKey("ISO_8859_5_E8"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_E8"));
                    break;
                case 0xd095:
                    if (keycodes.containsKey("ISO_8859_5_B5"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_B5"));
                    break;
                case 0xd0b5:
                    if (keycodes.containsKey("ISO_8859_5_D5"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_D5"));
                    break;
                case 0xd0a0:
                    if (keycodes.containsKey("ISO_8859_5_C0"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_C0"));
                    break;
                case 0xd180:
                    if (keycodes.containsKey("ISO_8859_5_E0"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_E0"));
                    break;
                case 0xd0a2:
                    if (keycodes.containsKey("ISO_8859_5_C2"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_C2"));
                    break;
                case 0xd182:
                    if (keycodes.containsKey("ISO_8859_5_E2"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_E2"));
                    break;
                case 0xd0ab:
                    if (keycodes.containsKey("ISO_8859_5_CB"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_CB"));
                    break;
                case 0xd18b:
                    if (keycodes.containsKey("ISO_8859_5_EB"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_EB"));
                    break;
                case 0xd0a3:
                    if (keycodes.containsKey("ISO_8859_5_C3"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_C3"));
                    break;
                case 0xd183:
                    if (keycodes.containsKey("ISO_8859_5_E3"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_E3"));
                    break;
                case 0xd098:
                    if (keycodes.containsKey("ISO_8859_5_B8"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_B8"));
                    break;
                case 0xd0b8:
                    if (keycodes.containsKey("ISO_8859_5_D8"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_D8"));
                    break;
                case 0xd09e:
                    if (keycodes.containsKey("ISO_8859_5_BE"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_BE"));
                    break;
                case 0xd0be:
                    if (keycodes.containsKey("ISO_8859_5_DE"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_DE"));
                    break;
                case 0xd09f:
                    if (keycodes.containsKey("ISO_8859_5_BF"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_BF"));
                    break;
                case 0xd0bf:
                    if (keycodes.containsKey("ISO_8859_5_DF"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_DF"));
                    break;
                case 0xd0ae:
                    if (keycodes.containsKey("ISO_8859_5_CE"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_CE"));
                    break;
                case 0xd18e:
                    if (keycodes.containsKey("ISO_8859_5_EE"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_EE"));
                    break;
                case 0xd0a9:
                    if (keycodes.containsKey("ISO_8859_5_C9"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_C9"));
                    break;
                case 0xd189:
                    if (keycodes.containsKey("ISO_8859_5_E9"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_E9"));
                    break;
                case 0xd090:
                    if (keycodes.containsKey("ISO_8859_5_B0"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_B0"));
                    break;
                case 0xd0b0:
                    if (keycodes.containsKey("ISO_8859_5_D0"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_D0"));
                    break;
                case 0xd0a1:
                    if (keycodes.containsKey("ISO_8859_5_C1"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_C1"));
                    break;
                case 0xd181:
                    if (keycodes.containsKey("ISO_8859_5_E1"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_E1"));
                    break;
                case 0xd094:
                    if (keycodes.containsKey("ISO_8859_5_B4"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_B4"));
                    break;
                case 0xd0b4:
                    if (keycodes.containsKey("ISO_8859_5_D4"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_D4"));
                    break;
                case 0xd0a4:
                    if (keycodes.containsKey("ISO_8859_5_C0"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_C0"));
                    break;
                case 0xd184:
                    if (keycodes.containsKey("ISO_8859_5_D0"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_D0"));
                    break;
                case 0xd093:
                    if (keycodes.containsKey("ISO_8859_5_B3"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_B3"));
                    break;
                case 0xd0b3:
                    if (keycodes.containsKey("ISO_8859_5_D3"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_D3"));
                    break;
                case 0xd0a7:
                    if (keycodes.containsKey("ISO_8859_5_C3"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_C3"));
                    break;
                case 0xd187:
                    if (keycodes.containsKey("ISO_8859_5_E3"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_E3"));
                    break;
                case 0xd099:
                    if (keycodes.containsKey("ISO_8859_5_B9"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_B9"));
                    break;
                case 0xd0b9:
                    if (keycodes.containsKey("ISO_8859_5_D9"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_D9"));
                    break;
                case 0xd09a:
                    if (keycodes.containsKey("ISO_8859_5_BA"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_BA"));
                    break;
                case 0xd0ba:
                    if (keycodes.containsKey("ISO_8859_5_DA"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_DA"));
                    break;
                case 0xd09b:
                    if (keycodes.containsKey("ISO_8859_5_BB"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_BB"));
                    break;
                case 0xd0bb:
                    if (keycodes.containsKey("ISO_8859_5_DB"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_DB"));
                    break;
                case 0xd0ac:
                    if (keycodes.containsKey("ISO_8859_5_CC"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_CC"));
                    break;
                case 0xd18c:
                    if (keycodes.containsKey("ISO_8859_5_EC"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_EC"));
                    break;
                case 0xd096:
                    if (keycodes.containsKey("ISO_8859_5_B6"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_B6"));
                    break;
                case 0xd0b6:
                    if (keycodes.containsKey("ISO_8859_5_D6"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_D6"));
                    break;
                case 0xe28496:
                    if (keycodes.containsKey("ISO_8859_5_F0"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_F0"));
                    break;
                case 0xd097:
                    if (keycodes.containsKey("ISO_8859_5_B7"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_B7"));
                    break;
                case 0xd0b7:
                    if (keycodes.containsKey("ISO_8859_5_D7"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_D7"));
                    break;
                case 0xd0a5:
                    if (keycodes.containsKey("ISO_8859_5_C5"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_C5"));
                    break;
                case 0xd185:
                    if (keycodes.containsKey("ISO_8859_5_E5"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_E5"));
                    break;
                case 0xd0a6:
                    if (keycodes.containsKey("ISO_8859_5_C6"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_C6"));
                    break;
                case 0xd186:
                    if (keycodes.containsKey("ISO_8859_5_E6"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_E6"));
                    break;
                case 0xd092:
                    if (keycodes.containsKey("ISO_8859_5_B2"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_B2"));
                    break;
                case 0xd0b2:
                    if (keycodes.containsKey("ISO_8859_5_D2"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_D2"));
                    break;
                case 0xd091:
                    if (keycodes.containsKey("ISO_8859_5_B1"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_B1"));
                    break;
                case 0xd0b1:
                    if (keycodes.containsKey("ISO_8859_5_D1"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_D1"));
                    break;
                case 0xd09d:
                    if (keycodes.containsKey("ISO_8859_5_BD"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_BD"));
                    break;
                case 0xd0bd:
                    if (keycodes.containsKey("ISO_8859_5_DD"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_DD"));
                    break;
                case 0xd09c:
                    if (keycodes.containsKey("ISO_8859_5_BC"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_BC"));
                    break;
                case 0xd0bc:
                    if (keycodes.containsKey("ISO_8859_5_DC"))
                        kbstrokes.add(keycodes.get("ISO_8859_5_DC"));
                    //UNICODE characters
                    break;
                case 0xc48d:
                    if (keycodes.containsKey("UNICODE_10D"))
                        kbstrokes.add(keycodes.get("UNICODE_10D"));
                    break;
                case 0xc5a1:
                    if (keycodes.containsKey("UNICODE_161"))
                        kbstrokes.add(keycodes.get("UNICODE_161"));
                    break;
                case 0xc5be:
                    if (keycodes.containsKey("UNICODE_17E"))
                        kbstrokes.add(keycodes.get("UNICODE_17E"));
                    break;
                case 0xc487:
                    if (keycodes.containsKey("UNICODE_107"))
                        kbstrokes.add(keycodes.get("UNICODE_107"));
                    break;
                case 0xc491:
                    if (keycodes.containsKey("UNICODE_111"))
                        kbstrokes.add(keycodes.get("UNICODE_111"));
                    break;
                case 0xc48c:
                    if (keycodes.containsKey("UNICODE_10C"))
                        kbstrokes.add(keycodes.get("UNICODE_10C"));
                    break;
                case 0xc5a0:
                    if (keycodes.containsKey("UNICODE_160"))
                        kbstrokes.add(keycodes.get("UNICODE_160"));
                    break;
                case 0xc5bd:
                    if (keycodes.containsKey("UNICODE_17D"))
                        kbstrokes.add(keycodes.get("UNICODE_17D"));
                    break;
                case 0xc486:
                    if (keycodes.containsKey("UNICODE_106"))
                        kbstrokes.add(keycodes.get("UNICODE_106"));
                    break;
                case 0xc490:
                    if (keycodes.containsKey("UNICODE_110"))
                        kbstrokes.add(keycodes.get("UNICODE_110"));
                    break;
                case 0xc582:
                    if (keycodes.containsKey("UNICODE_2C7"))
                        kbstrokes.add(keycodes.get("UNICODE_2C7"));
                    break;
                case 0xc581:
                    if (keycodes.containsKey("UNICODE_2D8"))
                        kbstrokes.add(keycodes.get("UNICODE_2D8"));
                    break;
                case 0xe282ac:
                    if (keycodes.containsKey("UNICODE_20AC"))
                        kbstrokes.add(keycodes.get("UNICODE_20AC"));
                    break;

                 */
            }
        }
        return kbstrokes;
    }
}
