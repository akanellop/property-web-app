
<table class="table">
    <thead>
    <th>Full Name</th>
    <th>SSN</th>
    <th>Address</th>
    <th>Phone Number</th>
    <th>Email</th>
    <th>Property Type</th>
    <th class="text-center">Edit</th>
    <th class="text-center">Remove</th>
    </thead>

    <tbody>
    <#list owners as owner>
        <tr data-id="${owner.id}">
            <td>${owner.firstname} ${owner.lastname}</td>
            <td>${owner.ssn}</td>
            <td>${owner.address}</td>
            <td>${owner.phone_number}</td>
            <td>${owner.email}</td>
            <td>${owner.propertyType}</td>

            <td class="text-center">
                <a href="/admin/${owner.id}/edit-owner/">
                    <span data-feather="tool"></span>
                </a>
            </td>
            <td class="text-center">
                <a href="#" data-toggle="modal" data-target="#remove_owner">
                    <span data-feather="x"></span>
                </a>
            </td>
        </tr>
    </#list>
    </tbody>
</table>

<div id="remove_owner" class="modal" tabindex="-1" role="dialog">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title">Owner</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <h5 style="color: #d94949">Caution!</h5>
                <p>This action will also delete the relevant repairs. Are you sure?</p>
            </div>
            <div class="modal-footer">
                <form method="post" id="deleteForm_owner">
                    <button type="button" class="btn btn-secondary" data-dismiss="modal">Cancel</button>
                    <button type="submit" class="btn btn-danger">Delete</button>
                </form>
            </div>
        </div>
    </div>
</div>


<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
        integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx"
        crossorigin="anonymous"></script>
<script src="https://unpkg.com/feather-icons/dist/feather.min.js"></script>
<script src="/js/modal_owner_delete.js"></script>
