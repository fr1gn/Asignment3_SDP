package assignment_2_Remote_Control;

public abstract class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public abstract void powerButton();
    public abstract void volumeButton(int volume);
    public abstract void channelButton(int channel);
}
