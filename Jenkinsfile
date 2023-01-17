node{
    def WORKSPACE = "C:\ProgramData\Jenkins\.jenkins\workspace\springboot-deploy"
    def dockerImageTag = "springboot-deploy${env.BUILD_NUMBER}"

    try{
         notifyBuild('STARTED')
         stage('Clone Repo') {
             // for display purposes
             // Get some code from a GitHub repository
             git url: 'https://gitlab.com/mainProgram1/groupe-api-back.git',
                 credentialsId: '13493707',
                 branch: 'master'
          }
         stage('Build docker') {
              dockerImage = docker.build("springboot-deploy:${env.BUILD_NUMBER}")
         }
         stage('Deploy docker'){
               echo "Docker Image Tag Name: ${dockerImageTag}"
               sh "docker stop springboot-deploy || true && docker rm springboot-deploy || true"
               sh "docker run --name springboot-deploy -d -p 8081:8081 springboot-deploy:${env.BUILD_NUMBER}"
         }
     }catch(e){
         currentBuild.result = "FAILED"
         throw e
     }finally{
         notifyBuild(currentBuild.result)
      }
     }
}