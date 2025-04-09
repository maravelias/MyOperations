package eu.maravelias.myoperations.view.customer;

import com.vaadin.flow.router.Route;
import eu.maravelias.myoperations.entity.Customer;
import eu.maravelias.myoperations.view.main.MainView;
import io.jmix.flowui.view.DialogMode;
import io.jmix.flowui.view.LookupComponent;
import io.jmix.flowui.view.StandardListView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;


@Route(value = "customers", layout = MainView.class)
@ViewController(id = "myops_Customer.list")
@ViewDescriptor(path = "customer-list-view.xml")
@LookupComponent("customersDataGrid")
@DialogMode(width = "64em")
public class CustomerListView extends StandardListView<Customer> {
}