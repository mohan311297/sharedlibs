def call() {
  sh ''' rm -rf dir1
         cd /home/ubuntu
         ls -lrt'''
}         

