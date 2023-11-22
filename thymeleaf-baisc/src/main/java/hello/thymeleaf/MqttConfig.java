package hello.thymeleaf;

import org.eclipse.paho.client.mqttv3.MqttAsyncClient;
import org.springframework.integration.core.MessageProducer;
import org.springframework.integration.mqtt.inbound.MqttPahoMessageDrivenChannelAdapter;

public class MqttConfig {

    private static final String BROKER_URL = "";
    private static final String MQTT_CLIENT_ID = MqttAsyncClient.generateClientId();
    private static final String TOPIC_FILTER = "parking_lot/0/#";

    public MessageProducer inboundChannel() {
        MqttPahoMessageDrivenChannelAdapter adapter =
                new MqttPahoMessageDrivenChannelAdapter(BROKER_URL, MQTT_CLIENT_ID, TOPIC_FILTER);

        adapter.setCompletionTimeout(5000);

    }



}
