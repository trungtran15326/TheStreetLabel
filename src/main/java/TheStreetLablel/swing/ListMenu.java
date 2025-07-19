package TheStreetLablel.swing;

import TheStreetLablel.event.EventMenuSelected;
import TheStreetLablel.model.Model_Menu1;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;
import javax.swing.SwingUtilities;

public class ListMenu<E extends Object> extends JList<E> {

    private final DefaultListModel model;

    private int selectedIndex = -1;
    private int overIndex = -1;
    private EventMenuSelected event;

    public void addEventSelected(EventMenuSelected event) {
        this.event = event;
    }

    public ListMenu() {
        model = new DefaultListModel();
        setModel(model);
        setOpaque(false);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                if (SwingUtilities.isLeftMouseButton(me)) {
                    int index = locationToIndex(me.getPoint());
                    Object o = model.getElementAt(index);
                    if (o instanceof Model_Menu1) {
                        Model_Menu1 menu = (Model_Menu1) o;
                        if (menu.getType() == Model_Menu1.MenuType.MENU) {
                            selectedIndex = index;
                            if(event != null){
                                event.selected(index);
                            }
                        } else {
                            selectedIndex = index;
                        }
                        repaint();
                    }
                }

            }

            @Override
            public void mouseExited(MouseEvent e) {
                overIndex = -1;
                repaint();
            }

        });

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                int index = locationToIndex(e.getPoint());
                if (index != overIndex) {
                    Object o = model.getElementAt(index);
                    if (o instanceof Model_Menu1) {
                        Model_Menu1 menu = (Model_Menu1) o;
                        if (menu.getType() == Model_Menu1.MenuType.MENU) {
                            overIndex = index;
                        } else {
                            overIndex = -1;
                        }
                        repaint();
                    }
                }
            }

        });

    }

    @Override
    public ListCellRenderer<? super E> getCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> jlist, Object o, int index, boolean Selected, boolean Focus) {
                Model_Menu1 data;
                if (o instanceof Model_Menu1) {
                    data = (Model_Menu1) o;
                } else {
                    data = new Model_Menu1("", Model_Menu1.MenuType.EMPTY);
                }

                ItemMenu item = new ItemMenu(data);
                item.setSelected(selectedIndex == index);
                item.setOver(overIndex == index);
                return item;
            }

        };
    }

    public void addItem(Model_Menu1 data) {
        model.addElement(data);
    }

}
