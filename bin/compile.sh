rm -rf classes/*
javac -d classes `find src -type f | grep java | grep -v swp`


