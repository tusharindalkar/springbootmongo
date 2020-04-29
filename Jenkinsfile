node{
  stage('SCM checkout'){
    git'https://github.com/tusharindalkar/springbootmongo'
  }
  stage('Compile package'){
      def mvnHome=tool name: 'maven' ,type:'maven' 
      sh '${mvnHome}/bin/mvn package'
  }
}
