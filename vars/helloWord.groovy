def call() {
  sh ''' rm -rf dir1
         cd ../..
         pwd'''
}         

