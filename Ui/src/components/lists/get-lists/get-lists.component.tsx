import React, { Component } from 'react';
import { environment } from '../../../environment';
import { Lists } from '../../../models/list';

interface IState {
    lists: Lists[]
}

export default class GroceryLists extends Component<{}, IState> {
    constructor(props: any) {
        super(props);
        this.state = {
            lists: []
        };
    }

    async componentDidMount() {
        this.getLists();
    };
    getLists = async () => {
        const resp = await fetch(environment.context + '/lists/', {
            credentials: 'include'
        });
        const listsFromServer = await resp.json();
        this.setState({
            lists: listsFromServer,
        });
    }

    render() {
        const lists = this.state.lists;
        return (
            <div>
                <table className="table table-hover">
                    <thead className="fr-thead">
                        <tr>
                            <th scope="col">List Id</th>
                            <th scope="col">List Name</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            lists.map(list =>
                                <tr key={'userId-' + list.listId}>
                                    <td>{list.listId}</td>
                                    <td>{list.listName}</td>
                                </tr>
                            )
                        }
                    </tbody>
                </table>
            </div>
        )
    }
}