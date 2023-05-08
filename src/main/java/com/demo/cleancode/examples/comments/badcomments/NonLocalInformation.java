package com.demo.cleancode.examples.comments.badcomments;

/*
Aside from the fact that it is horribly redundant comment, it also offers
information about the default port. And yet the function has absolutely no control over
what that default is. The comment is not describing the function, but some other, far distant part of the system.
Of course there is no guarantee that this comment will be changed when the code containing the default is changed.
 */
public class NonLocalInformation {

    private int port;
    /**
     * Port on which fitnesse would run. Defaults to <b>8082</b>.
     *
     * @param port
     */
    public void setPort(int port)
    {
        this.port = port;
    }
}
