package se.llbit.chunky.block;

import se.llbit.chunky.model.SculkSensorModel;
import se.llbit.chunky.resources.Texture;

public class SculkSensor extends AbstractModelBlock {

  private final String phase;

  public SculkSensor(String phase) {
    super("sculk_sensor", Texture.sculkSensorTop);
    this.phase = phase;
    this.model = new SculkSensorModel(phase.equals("active"));
  }

  public boolean isActive() {
    return phase.equals("active");
  }

  @Override
  public String description() {
    return "sculk_sensor_phase=" + phase;
  }
}
