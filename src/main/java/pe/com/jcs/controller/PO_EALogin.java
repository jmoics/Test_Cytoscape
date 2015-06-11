package pe.com.jcs.controller;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;
import org.zkoss.zul.Window;

/* Permite tener acceso a los servicios*/
/**
 * TODO comment!
 *
 * @author jcuevas
 * @version $Id$
 */
@VariableResolver(DelegatingVariableResolver.class)
public class PO_EALogin
    extends SelectorComposer<Window>
{

    /*private static final long serialVersionUID = -1869322490528675540L;
    @Wire
    private Textbox txtUser, txtPass;
    @Wire
    private Combobox cmbEmp;
    @WireVariable
    private Desktop desktop;
    @Wire
    private Window wEAL;
    // En este caso companyService esta siendo obtenido de los beans de spring.
    @WireVariable
    private BusinessService<DTO_Company> companyService;
    @WireVariable
    private BusinessService<DTO_User> authService;
    @WireVariable
    private BusinessService<DTO_Employee> employeeService;

    @Override
    public void doAfterCompose(final Window _comp)
        throws Exception
    {
        super.doAfterCompose(_comp);
        getCompanies();
        this.txtUser.setFocus(true);
    }*/

    /**
     *
     */
    /*public void getCompanies()
    {
        List<DTO_Company> companys;
        //companyService = (BusinessService<DTO_Company>) ContextLoader.getService(wEAL, "companyService");
        final ServiceInput<DTO_Company> input = new ServiceInput<DTO_Company>();
        input.setAction(Constantes.V_LIST);

        final ServiceOutput<DTO_Company> output = this.companyService.execute(input);
        if (output.getErrorCode() == Constantes.OK) {
            companys = output.getLista();
            for (final DTO_Company emp : companys) {
                final Comboitem item = new Comboitem();
                item.setLabel(emp.getBusinessName());
                item.setAttribute(Constantes.ATTRIBUTE_COMPANY, emp);
                this.cmbEmp.appendChild(item);
            }
        } else {
            companys = null;
        }
    }*/

    /**
     * @throws InterruptedException on error.
     */
    /*@Listen("onClick = #btnIngresar; onOK = #txtPass; onOK = #txtUser")
    public void authenticate()
        throws InterruptedException
    {
        final DTO_User user = new DTO_User();
        user.setUsername(this.txtUser.getValue());
        user.setPassword(this.txtPass.getValue());
        if (this.cmbEmp.getSelectedItem() != null) {
            final DTO_Company company = (DTO_Company) this.cmbEmp.getSelectedItem()
                            .getAttribute(Constantes.ATTRIBUTE_COMPANY);
            if (company != null) {
                user.setCompanyId(company.getId());

                final DTO_User validado = getUser(user);
                if (validado != null) {
                    final DTO_Employee employee = getEmployee(validado);
                    this.desktop.getSession().setAttribute(Constantes.ATTRIBUTE_EMPLOYEE, employee);
                    this.desktop.getSession().setAttribute(Constantes.ATTRIBUTE_USER, validado);
                    this.desktop.getSession().setAttribute(Constantes.ATTRIBUTE_COMPANY, company);
                    if (company.getId().equals(Constantes.INSTITUCION_JX_MARKET)) {
                        Executions.sendRedirect("eESolicitudesPendientes.zul");
                    } else {
                        Executions.sendRedirect("eAMainMenu.zul");
                    }
                } else {
                    this.txtUser.setText("");
                    this.txtUser.setFocus(true);
                    this.txtPass.setText("");
                    this.wEAL.getFellow("badauth").setVisible(true);
                }
            } else {
                Messagebox.show("No se cargo la company", "JX_Market", Messagebox.OK, Messagebox.INFORMATION);
            }
        } else {
            Messagebox.show("Debe seleccionar una company", "JX_Market", Messagebox.OK, Messagebox.INFORMATION);
        }
    }*/

    /**
     * @param _user User.
     * @return User existent.
     */
    /*public DTO_User getUser(final DTO_User _user)
    {
        DTO_User user;
        //authService = (BusinessService<DTO_User>) ContextLoader.getService(wEAL, "authService");
        final ServiceInput<DTO_User> input = new ServiceInput<DTO_User>(_user);

        final ServiceOutput<DTO_User> output = this.authService.execute(input);
        if (output.getErrorCode() == Constantes.OK) {
            user = output.getObject();
        } else {
            user = null;
        }

        return user;
    }*/

    /**
     * @param _usu User.
     * @return Employee.
     */
    /*public DTO_Employee getEmployee(final DTO_User _usu)
    {
        DTO_Employee ret = null;
        //employeeService = (BusinessService<DTO_Employee>) ContextLoader.getService(wEAL, "employeeService");
        final DTO_Employee emp = new DTO_Employee();
        emp.setCompanyId(_usu.getCompanyId());
        emp.setUserId(_usu.getId());
        final ServiceInput<DTO_Employee> input = new ServiceInput<DTO_Employee>(emp);
        input.setAction(Constantes.V_GET);
        final ServiceOutput<DTO_Employee> output = this.employeeService.execute(input);
        if (output.getErrorCode() == Constantes.OK) {
            ret = output.getObject();
        }
        return ret;
    }*/
}
