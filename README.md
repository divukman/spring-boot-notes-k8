# spring-boot-notes-k8
Demo project: Spring Boot + Kubernetes. 
Original tutorial at [Source tutorial](https://learnk8s.io/spring-boot-kubernetes-guide), but refactored a bit here.

# Run
```
$ kubectl apply -f kube
$ kubectl get pods --watch
$ minikube service knote --url
```


# Tech
* [Kubectl](https://kubernetes.io/docs/tasks/tools/install-kubectl-linux/) - Install kubectl on local machine.
* [Minikube](https://minikube.sigs.k8s.io/docs/start/) - Install Minikube (local Kubernetes) on local machine.
