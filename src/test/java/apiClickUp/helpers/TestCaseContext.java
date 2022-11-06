package apiClickUp.helpers;

import apiClickUp.domain.Folder;

public class TestCaseContext {
    private static Folder folder;
    public static void init(){
        folder = null;
    }

    public static void setFolder(Folder folder){
        TestCaseContext.folder = folder;
    }
    public static Folder getFolder(){
        return folder;
    }
}
