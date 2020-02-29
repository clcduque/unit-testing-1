package school.cesar.unit;

public class Message {

    private String msg;
    private String rec;

    public Message() {}

        public Message (String msg, String rec) {

             this.msg = msg;
             this.rec = rec;

        }

            public String getMsg () {
                return msg;
            }

            public String getRec () {
                return rec;
            }



}
