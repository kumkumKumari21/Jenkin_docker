FROM openjdk:21
WORKDIR /app
COPY . .
RUN javac *.java
CMD ["java","Grade"]
