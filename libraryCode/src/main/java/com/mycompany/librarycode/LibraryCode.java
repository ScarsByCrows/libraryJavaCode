package com.mycompany.librarycode;

import libro.Books;
public class LibraryCode {

    public static void main(String[] args) {
        
    }
    
    public class Data {
        String title;
        String author;
        String genre;
        String datepub;
        String available;
        String quantity;
        String loantime;
        String user;
        String loandate;
        String returndate;
        
        public Data(String title, String author, String genre, String datepub, String available, String quantity, String loantime, String user, String loandate, String returndate){
            this.title = title;
            this.author = author;
            this.genre = genre;
            this.datepub = datepub;
            this.available = available;
            this.quantity = quantity;
            this.loantime = loantime;
            this.user = user;
            this.loandate = loandate;
            this.returndate = returndate;           
        }
        
        public Data(){
         
        }
        
        public void dataFunction(){
            System.out.println(this.title);
            System.out.println(this.author);
            System.out.println(this.genre);
            System.out.println(this.datepub);
            System.out.println(this.available);
            System.out.println(this.quantity);
            System.out.println(this.loantime);
            System.out.println(this.user);
            System.out.println(this.returndate);
        }

        public String getTitle() {
            return title;
        }

        public String getAuthor() {
            return author;
        }

        public String getGenre() {
            return genre;
        }

        public String getDatepub() {
            return datepub;
        }

        public String getAvailable() {
            return available;
        }

        public String getQuantity() {
            return quantity;
        }

        public String getLoantime() {
            return loantime;
        }

        public String getUser() {
            return user;
        }

        public String getLoandate() {
            return loandate;
        }

        public String getReturndate() {
            return returndate;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public void setGenre(String genre) {
            this.genre = genre;
        }

        public void setDatepub(String datepub) {
            this.datepub = datepub;
        }

        public void setAvailable(String available) {
            this.available = available;
        }

        public void setQuantity(String quantity) {
            this.quantity = quantity;
        }

        public void setLoantime(String loantime) {
            this.loantime = loantime;
        }

        public void setUser(String user) {
            this.user = user;
        }

        public void setLoandate(String loandate) {
            this.loandate = loandate;
        }

        public void setReturndate(String returndate) {
            this.returndate = returndate;
        }
        
        

        
    }
}
