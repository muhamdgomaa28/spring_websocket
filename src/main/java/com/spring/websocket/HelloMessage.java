package com.spring.websocket;

/**
 * Created by muhamd gomaa on 11/22/2017.
 */
public class HelloMessage {


        private String name;

        public HelloMessage() {
        }

        public HelloMessage(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


}
