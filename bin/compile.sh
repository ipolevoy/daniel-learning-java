rm -r classes/*
javac -d classes `find src -type f | grep java`
#javac -d classes `find src *.java | grep java`


