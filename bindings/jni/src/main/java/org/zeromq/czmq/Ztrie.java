/*
################################################################################
#  THIS FILE IS 100% GENERATED BY ZPROJECT; DO NOT EDIT EXCEPT EXPERIMENTALLY  #
#  Please refer to the README for information about making permanent changes.  #
################################################################################
*/
package org.zeromq.czmq;

public class Ztrie implements AutoCloseable{
    static {
        try {
            System.loadLibrary ("czmqjni");
        }
        catch (Exception e) {
            System.exit (-1);
        }
    }
    long self;
    /*
    Creates a new ztrie.
    */
    native static long __new (char delimiter);
    public Ztrie (char delimiter) {
        /*  TODO: if __new fails, self is null...  */
        self = __new (delimiter);
    }
    public Ztrie (long pointer) {
        self = pointer;
    }
    public Ztrie () {
        self = 0;
    }
    /*
    Destroy the ztrie.
    */
    native static void __destroy (long self);
    @Override
    public void close () {
        __destroy (self);
        self = 0;
    }
    /*
    Removes a route from the trie and destroys its data. Returns -1 if the
    route does not exists, otherwise 0.                                   
    the start of the list call zlist_first (). Advances the cursor.       
    */
    native static int __removeRoute (long self, String path);
    public int removeRoute (String path) {
        return __removeRoute (self, path);
    }
    /*
    Returns true if the path matches a route in the tree, otherwise false.
    */
    native static boolean __matches (long self, String path);
    public boolean matches (String path) {
        return __matches (self, path);
    }
    /*
    Returns the data of a matched route from last ztrie_matches. If the path
    did not match, returns NULL. Do not delete the data as it's owned by    
    ztrie.                                                                  
    */
    native static long __hitData (long self);
    public long hitData () {
        return __hitData (self);
    }
    /*
    Returns the count of parameters that a matched route has.
    */
    native static long __hitParameterCount (long self);
    public long hitParameterCount () {
        return __hitParameterCount (self);
    }
    /*
    Returns the parameters of a matched route with named regexes from last   
    ztrie_matches. If the path did not match or the route did not contain any
    named regexes, returns NULL.                                             
    */
    native static long __hitParameters (long self);
    public Zhashx hitParameters () {
        return new Zhashx (__hitParameters (self));
    }
    /*
    Returns the asterisk matched part of a route, if there has been no match
    or no asterisk match, returns NULL.                                     
    */
    native static String __hitAsteriskMatch (long self);
    public String hitAsteriskMatch () {
        return __hitAsteriskMatch (self);
    }
    /*
    Print the trie
    */
    native static void __print (long self);
    public void print () {
        __print (self);
    }
    /*
    Self test of this class.
    */
    native static void __test (boolean verbose);
    public void test (boolean verbose) {
        __test (verbose);
    }
}