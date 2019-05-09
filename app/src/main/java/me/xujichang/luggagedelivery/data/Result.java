package me.xujichang.luggagedelivery.data;

/**
 * A generic class that holds a result success w/ data or an error exception.
 */
public class Result<T> {
    private int flag = -1;

    private Result() {
    }

    @Override
    public String toString() {
        if (this instanceof Result.Success) {
            Result.Success success = (Result.Success) this;
            return "Success[data=" + success.getData().toString() + "]";
        } else if (this instanceof Result.Error) {
            Result.Error error = (Result.Error) this;
            return "Error[exception=" + error.getError().toString() + "]";
        }
        return "";
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int pFlag) {
        flag = pFlag;
    }

    public Result(int pFlag) {
        flag = pFlag;
    }

    public final static class Success<T> extends Result {
        private T data;

        public Success(T data, int flag) {
            super(flag);
            this.data = data;
        }

        public Success() {
        }

        public Success(int pFlag) {
            super(pFlag);
        }

        public T getData() {
            return this.data;
        }
    }

    public final static class Error extends Result {
        private Exception error;

        public Error(Exception error, int flag) {
            super(flag);
            this.error = error;

        }

        public Error(int pFlag) {
            super(pFlag);
        }

        public Error(String pMsg, int flag) {
            super(flag);
            error = new RuntimeException(pMsg);
        }

        public Exception getError() {
            return this.error;
        }
    }

    public static final class Empty extends Result {

    }

    public interface CallBack {
        void onSuccess();
    }
}
