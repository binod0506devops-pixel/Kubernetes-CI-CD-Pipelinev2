
### CI/CD Pipeline Flow (GitHub Actions → Docker Hub → Argo CD → Amazon EKS)

* ✔ Developer pushes code to GitHub
* ✔ GitHub Actions pipeline is triggered automatically
* ✔ Maven project is built
* ✔ Unit tests are executed
* ✔ SonarQube quality analysis is performed
* ✔ Docker image is built
* ✔ Docker image is pushed to Docker Hub
* ⏭ Kubernetes manifests are updated with the new image version
* ⏭ Argo CD detects changes and deploys to Amazon EKS cluster



### Interaction Between Docker Hub and GitHub

* Create a personal access token on Docker Hub.
* Store the Docker username and token as GitHub repository secrets.
* In the GitHub Actions workflow, use these secrets to log in to Docker Hub and push Docker images.

### Interaction Between SonarQube and GitHub

* Create a project on SonarQube.
* Generate a SonarQube token for authentication.
* Store the SonarQube token as a GitHub repository secret.
* In the GitHub Actions workflow, configure the SonarQube scanner using this token.
* Run SonarQube analysis during the CI process to ensure code quality checks.


