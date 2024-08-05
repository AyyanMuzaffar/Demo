pipeline {
    agent any
    stages  {
        stage("build") {
            steps {
                echo "Building an app"
            }
        }

        stage("test")  {
            steps {
                echo "Testing an app"
            }
        }
      
        stage("deploy")  {
            steps {
                echo "Deploying an app"
            }
        }
    }
}
