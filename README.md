# CD Canary Demo – Experiment 3.2

**Name:** Dramane Traore
**UID:** 24BCY70270

## Aim
Design and implement a Continuous Deployment pipeline with Docker,
GitHub Actions and a canary deployment strategy.

## Run locally
    mvn spring-boot:run

## Docker
    docker build -t cd-canary-demo:v1 .
    docker run -p 8080:8080 cd-canary-demo:v1

## Endpoints
- `GET /` : returns message and version
- `GET /actuator/health` : health check


## CI/CD Pipeline
GitHub Actions workflow (`.github/workflows/cd.yml`):
1. Build the project and run unit tests (Maven, JDK 17)
2. Build the Docker image
3. Push the image to Docker Hub (`latest` and commit SHA tags)

Required GitHub secrets: `DOCKERHUB_USERNAME`, `DOCKERHUB_TOKEN`