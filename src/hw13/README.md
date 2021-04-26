
# Threads


## Rule 1: Exit process with no daemon threads

* If all threads exit, then the main process will exit too. 
* If a single user 
thread is still running, it will keep the current process up  


## Rule 2: Exit process with daemon threads

If only daemon threads remain, then the main process will end, killing the daemon threads immediately. 