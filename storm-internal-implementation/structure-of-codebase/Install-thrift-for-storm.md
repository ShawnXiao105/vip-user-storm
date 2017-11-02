The first place is to understand [storm.thrift](https://github.com/apache/storm/blob/v1.1.1/storm-core/src/storm.thrift) file




###    install thrift for storm (ubuntu)



    git clone https://github.com/nathanmarz/thrift.git

    sudo apt-get install automake bison flex g++ git libboost1.55-all-dev libevent-dev libssl-dev libtool make pkg-config

    wget http://sourceforge.net/projects/boost/files/boost/1.60.0/boost_1_60_0.tar.gz  

    tar xvf boost_1_60_0.tar.gz
    cd boost_1_60_0
    ./bootstrap.sh
    sudo ./b2 install
    whereis boost
    # /usr/include/boost

    # change to thrift path
    cd thrift
    ./bootstrap.sh

    autoreconf -i #solve the error syntax error near unexpected token `GLIB,'
    ./configure
    #Make thrift:
    #[Potential Problem]
    #1) Downgrade automake to 1.11.5, then it's fixed; 2) Edit the file "thriftl.cc", search and replace "thrifty.h" with "thrifty.hh", then compile it again.
    make
    #I use the second one
    #install
    make install


###    Generate java code based on [storm.thrift]( https://raw.githubusercontent.com/apache/storm/v1.1.1/storm-core/src/storm.thrift)    



    #get storm.thrift
    wget https://raw.githubusercontent.com/apache/storm/v1.1.1/storm-core/src/storm.thrift
    #generate java code
    thrift --gen java storm.thrift


Well Done, I can find source code inside /gen-java
    