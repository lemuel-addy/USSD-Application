package ussd.prototype;

public final class ResponseObject {
        private boolean shouldClose;
        private String ussdMenu;
        private int responseExitCode;
        private String responseMessage;

    public boolean isShouldClose() {
        return shouldClose;
    }

    public void setShouldClose(boolean shouldClose) {
        this.shouldClose = shouldClose;
    }

    public String getUssdMenu() {
        return ussdMenu;
    }

    public void setUssdMenu(String ussdMenu) {
        this.ussdMenu = ussdMenu;
    }

    public int getResponseExitCode() {
        return responseExitCode;
    }

    public void setResponseExitCode(int responseExitCode) {
        this.responseExitCode = responseExitCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}

