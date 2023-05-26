package com.demo.cleancode.examples.comments.goodcomments;

public class ExplanationOfIntent {

    // We're using a binary search algorithm to search for a user's grade because the array is already sorted
    public int searchUserGrade(Grade[] grades, String user) {
        int left = 0;
        int right = grades.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (grades[mid].getUser().equals(user)) {
                return grades[mid].getGrade();
            } else if (grades[mid].getUser().compareTo(user) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public class Grade {
        private String user;
        private int grade;

        public Grade(String user, int grade) {
            this.user = user;
            this.grade = grade;
        }

        public String getUser() {
            return user;
        }

        public int getGrade() {
            return grade;
        }
    }
}
