package MainMenu;

public class GuiNode {
	public GuiNode guiNode;
	public String setguiNode(GuiNode guinode){
		this.guiNode=guiNode;
	}
	public GuiNode(GuiNode guiNode) {
		this.guiNode=guiNode;
	}
	public String getGuiNode(GuiNode guiNode) {
		return guiNode;
	}
	public String InitGuiNode(GuiNode guiNode) {
		if(guiNode.equals(null))return guiNode;
	}

}
