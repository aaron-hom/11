#Makefile
#Aaron Hom & Zimraan Hamid
#awhom & zjhamid
#pa5
# A Makefile for the Queens program

Roots: Queens.class
    echo Main-class: Queens > Manifest
    jar cvfm Queens Manifest Queens.class
    rm Manifest
    chmod u+x Queens

Roots.class: Queens.java
    javac -Xlint Queens.java

clean:
    rm -f Queens.class Queens

submit: Makefile Queens.java
    submit cmps011-pt.w16 pa5 Makefile Queens.java PAIR
