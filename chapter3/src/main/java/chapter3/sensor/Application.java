package chapter3.sensor;

import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;

public class Application {
        public static void main(String[] args) {
            Vertx vertx = Vertx.vertx();
            vertx.deployVerticle("chapter3.sensor.HeatSensor", new DeploymentOptions().setInstances(10));
            vertx.deployVerticle("chapter3.sensor.Listener");
            vertx.deployVerticle("chapter3.sensor.SensorData");
            vertx.deployVerticle("chapter3.sensor.HttpServer");
        }
}
