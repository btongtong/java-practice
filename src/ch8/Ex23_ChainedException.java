package ch8;

public class Ex23_ChainedException {
    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException se) {
            InstallException ie = new InstallException("설치 중 예외 발생");
            ie.initCause(se);
            throw ie;
        } catch (MemoryException me) {
            InstallException ie = new InstallException("설치 중 예외 발생");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException, MemoryException {
        if(!enoughSpace())
            throw new SpaceException("설치할 공간이 부족합니다.");
        if(!enoughMemory())
            throw new MemoryException("메모리가 부족합니다.");
    }
    static void copyFiles() {}
    static void deleteTempFiles() {}
    static boolean enoughSpace() {
        return false;
    }
    static boolean enoughMemory() {
        return true;
    }
}

class InstallException extends Exception {
    InstallException (String msg) {
        super(msg);
    }
}

class SpaceException_c extends Exception {
    SpaceException_c(String msg) {
        super(msg);
    }
}

class MemoryException_c extends Exception {
    MemoryException_c(String msg) {
        super(msg);
    }
}