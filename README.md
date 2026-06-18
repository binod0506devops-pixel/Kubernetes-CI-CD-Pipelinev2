
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


### Write Kubernetes manifests (Deployment, Service, Ingress or LoadBalancer) and deploy the app so it is accessible via a public URL or NodePort



### Minikube
# Check Minikube status: minikube status
# Start Minikube cluster: minikube start
# Stop Minikube cluster: minikube stop

### Deployment
# Create or update deployment
kubectl apply -f deployment.yaml

# List deployments
kubectl get deployment

# View deployment details
kubectl describe deployment user-app-deployment

# Check rollout status
kubectl rollout status deployment/user-app-deployment

# Restart deployment
kubectl rollout restart deployment/user-app-deployment

# Verify deployed image
kubectl get deployment user-app-deployment -o=jsonpath="{.spec.template.spec.containers[0].image}"

### Pods
# List pods
kubectl get pods

# Watch pods in real time
kubectl get pods -w

# View pod details
kubectl describe pod <pod-name>

# View pod logs
kubectl logs <pod-name>

# Stream pod logs
kubectl logs -f <pod-name>

### Services
# List services
kubectl get svc

# View service details
kubectl describe svc user-app-service

### Endpoints
# List service endpoints
kubectl get endpoints

### Cluster Verification
# View all cluster resources
kubectl get all

# Display cluster information
kubectl cluster-info

# List cluster nodes
kubectl get nodes

### Port Forwarding
# Forward service port to local machine
kubectl port-forward svc/user-app-service 8081:8081

### Execute Inside Pod
# Open shell inside pod
kubectl exec -it <pod-name> -- sh

### Image Verification
# Check deployment configuration
kubectl describe deployment user-app-deployment

# Verify image currently deployed
kubectl get deployment user-app-deployment -o=jsonpath="{.spec.template.spec.containers[0].image}"

### Application URLs
# Start port forwarding before accessing URLs
kubectl port-forward svc/user-app-service 8081:8081
kubectl port-forward svc/argocd-server -n argocd 8080:443


kubectl -n argocd get secret argocd-initial-admin-secret -o jsonpath="{.data.password}" | base64 -d
# Swagger UI  http://localhost:8081/swagger-ui/index.html


# OpenAPI Documentation http://localhost:8081/v3/api-docs

# Spring Boot Actuator http://localhost:8081/actuator

# Health Check http://localhost:8081/actuator/health

# Users API http://localhost:8081/api/users

# H2 Database Console http://localhost:8081/h2-console

# Set-Location "D:\CI-CD-Factory\pipeline-v2\Kubernetes CI_CD Pipelinev2\Kubernetes-CI-CD-Pipelinev2" 


# Argo cd:credential
# Username: admin
# Password:WkRRYVlhU1MwVnYxYmswUg==
Argo cd :https://localhost:8080/applications?proj=&sync=&autoSync=&health=&namespace=&cluster=&labels=&annotations=&operation=

