   /*
    * Licensed under the Apache License, Version 2.0 (the "License");
    * you may not use this file except in compliance with the License.
    * You may obtain a copy of the License at
    *
    *      http://www.apache.org/licenses/LICENSE-2.0
    *
    * Unless required by applicable law or agreed to in writing, software
    * distributed under the License is distributed on an "AS IS" BASIS,
    * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    * See the License for the specific language governing permissions and
    * limitations under the License.
    */
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