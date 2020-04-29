node{
  stage('SCM checkout'){
    git'https://github.com/tusharindalkar/springbootmongo'
  }
  stage('Compile package'){
      def mvn = tool (name: 'maven3', type: 'maven') + '/bin/mvn'
      sh '${mvnHome}/bin/mvn package'
  }
}
