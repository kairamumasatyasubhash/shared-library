import com.subhash.builds.caluclator

def call (Map pipelineparams) {

    caluclator caluclator = new caluclator(this)
    pipelines {
    agent any
    stages {
        stage ('Build') {
            steps {
                script {
                    echo 'Building...'
                    println caluclator.add(2, 3)
                }
            }
        }
        stage ('Test') {
            steps {
                echo 'Testing...'
            }
        }
        stage ('Deploy') {
            steps {
                echo 'Deploying...'
            }
        }
        stage ('Subbu Stage') {
            steps {
                echo 'This is Subbu stage...'
            }
        }
        stage ('Final Stage') {
            steps {
                echo 'This is the final stage...'
            }
        }
    }
}
}

// pipelines {
//     agent any
//     stages {
//         stage ('Build') {
//             steps {
//                 echo 'Building...'
//             }
//         }
//         stage ('Test') {
//             steps {
//                 echo 'Testing...'
//             }
//         }
//         stage ('Deploy') {
//             steps {
//                 echo 'Deploying...'
//             }
//         }
//         stage ('Subbu Stage') {
//             steps {
//                 echo 'This is Subbu stage...'
//             }
//         }
//         stage ('Final Stage') {
//             steps {
//                 echo 'This is the final stage...'
//             }
//         }
//     }
// }